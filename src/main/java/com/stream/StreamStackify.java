package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStackify {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(23, "Abhi", 300000.0));
		list.add(new Employee(23, "Abhi", 300000.0));
		list.add(new Employee(43, "Tanny", 40000.0));
		list.add(new Employee(33, "Sallu", 50000.0));
		list.add(new Employee(44, "Fatema", 600000.0));
		list.stream().filter(e -> e.getEmpName() != null).filter(e -> e.getEmpSal() < 300000)
				.forEach(System.out::println);
		list.stream().map(e -> e.getEmpName().toLowerCase()).forEach(System.out::println);
		list.stream().findFirst().orElse(null);
		Employee[] employee = list.stream().toArray(Employee[]::new);
		System.out.println(Arrays.toString(employee));
		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(53, "Babul", 900000.0));
		list1.add(new Employee(73, "Parimal", 700000.0));
		list1.add(new Employee(63, "Rabi", 40000.0));

		List<List<Employee>> list3 = Arrays.asList(list, list1);
		list3.stream().flatMap(Collection::stream).forEach(System.out::println);
		Long length = list1.stream().count();
		System.out.println(length);
		list.stream().sorted((e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName())).forEach(System.out::println);
		int list5 = list.stream().mapToInt(Employee::getEmpId).max().orElse(0);
		System.out.println(list5);
		System.out.println("=============********==============");
		list.stream().map(e -> e.getEmpName()).distinct().forEach(System.out::println);
		System.out.println("=============********==============");
		boolean emp = list.stream().allMatch(e -> e.getEmpName().startsWith("T"));
		boolean emp1 = list.stream().anyMatch(e -> e.getEmpName().startsWith("T"));
		boolean emp2 = list.stream().noneMatch(e -> e.getEmpName().startsWith("Y"));
		System.out.println(emp + " " + emp1 + " " + emp2);
		System.out.println("=============********==============");
		Double avgSal = list.stream().mapToDouble(Employee::getEmpSal).average().orElse(0.0);
		Double salSum = list.stream().map(Employee::getEmpSal).reduce(0.0, Double::sum);
		System.out.println(avgSal + " " + salSum);
		System.out.println("=============********==============");
		String empName = list.stream().map(Employee::getEmpName).collect(Collectors.joining(","));
		System.out.println(empName);
		System.out.println("=============********==============");
		Set<String> emp1Name = list.stream().map(Employee::getEmpName).collect(Collectors.toSet());
		System.out.println(emp1Name);
		System.out.println("=============********==============");
		Vector<String> empCollection = list.stream().map(Employee::getEmpName)
				.collect(Collectors.toCollection(Vector::new));
		System.out.println(empCollection);
		System.out.println("=============********==============");
		List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
		Map<Boolean, List<Integer>> isEven = intList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println(isEven);
		System.out.println("=============********==============");
		Map<Character, List<Employee>> groupByAlphabet = list.stream()
				.collect(Collectors.groupingBy(e -> new Character(e.getEmpName().charAt(0))));
		System.out.println(groupByAlphabet);
		Map<Character, List<Integer>> idGroupedByAlphabet = list.stream()
				.collect(Collectors.groupingBy(e -> new Character(e.getEmpName().charAt(0)),
						Collectors.mapping(Employee::getEmpId, Collectors.toList())));
		System.out.println(idGroupedByAlphabet);
		System.out.println("=============********==============");
		Double percentage = 10.0;
		Double salIncrOverhead = list.stream()
				.collect(Collectors.reducing(0.0, e -> e.getEmpSal() * percentage / 100, (s1, s2) -> s1 + s2));
		System.out.println(salIncrOverhead);
		System.out.println("=============********==============");
		Comparator<Employee> byNameLength = Comparator.comparing(Employee::getEmpName);

		Map<Character, Optional<Employee>> longestNameByAlphabet = list.stream().collect(Collectors.groupingBy(
				e -> new Character(e.getEmpName().charAt(0)), Collectors.reducing(BinaryOperator.maxBy(byNameLength))));

		System.out.println(longestNameByAlphabet);
		System.out.println("=============********==============");
		list.stream().parallel().forEach(e -> System.out.println(e));
		System.out.println("=============********==============");
		Stream.generate(Math::random).limit(5).forEach(System.out::println);

	}

}

class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;

	public Employee(Integer empId, String empName, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}