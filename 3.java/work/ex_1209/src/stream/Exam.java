package stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Student{
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	 @Override
	   public String toString() {
	      return name + "("+score+")";
	   }
	
}


public class Exam {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
		
		//3의 배수의 합을 구하시오
		int sum1 = nums.stream()
			    .filter(x -> x % 3 == 0)
			    .reduce(0, (x1, x2) -> x1 + x2);

		int sum = nums.stream()
			.filter(x -> x% 3 ==0)
			.mapToInt( x -> x)
			.sum();
		System.out.println(sum);
		
		
		List<String> words = List.of("Apple","Banana","Acocado","Cherry","Apricot");
		
		//"A"로 시작하는 문자열만 포함한, 소문자로 바꾼 List를 만드세요
		List<String> result = words.stream()	
										.filter(x -> x.startsWith("A"))
										.map(String::toLowerCase)
										.collect(Collectors.toList());
		
		System.out.println(result);
		
		
		List<Student> students = List.of(
				new Student("Kim",82),
				new Student("Lee",95),
				new Student("Park",60),
				new Student("Choi",77),
				new Student("Jung",90)
				);
		
		//점수가 80점 이상인 학생만 필터링하고
		//점수를 기준으로 내림차순으로 정렬한뒤
		//List<Student>로 다시 모으는 코드 작성하다
List<Student> result1 = students.stream()
							.filter(s-> s.getScore()>=80)
							.sorted((s1,s2) -> s2.getScore() -s1.getScore())
							.collect(Collectors.toList());
		
	//성이 3글자 인 학생만 필터링에서 리스트 만들기
students.stream()
		.filter(x -> x.getName().length() ==3)
		.collect(Collectors.toList());

	//점수가 80점이 상인 학생수
long count= students.stream()
					.filter(x -> x.getScore() >=80)
					.count();

	//80점 이상인 학생들의 평균
double avg = students.stream()
					.filter(x -> x.getScore() >=80)
					.mapToInt(Student::getScore) //학생 객체에서 점수만 뽑아서 IntStream으로 만들어라
					.average()// 평균을 계산을 해라
					.orElse(0.0); //값이 없으면 기본값 0.0을 반환해라
//student.stream() -> Stream<Student>
//평균,합계,최데값같은 "숫자연산"을 하고 싶을 때는 정수 스트링(IntStream)이 필요하다


	//점수 구간별 그룹핑
	//90점 이상 -> key "A"
	//80점 이상 -> key "B"
	//70점 이상 -> key "C"
Map<String, List<Student>> grouped = students.stream()
							.collect(Collectors.groupingBy(s->{
								int score = s.getScore();
								if(score >=90) return "A";
					 			else if (score >=80) return "B";
								else if (score >=70) return "C";
								else return "D";
							}));
		
		System.out.println(grouped);
		
	//점수를 기준으로 내림차순 정렬한 뒤 상위 3명을 추출해서 리스트로 만들기
		
		List<Student> result2 = students.stream()
								.sorted((s1,s2) -> s2.getScore() - s1.getScore())
								.limit(3)
								.collect(Collectors.toList());
		
		System.out.println(result2);
		
		
		
	}

}
