package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class studentSort {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();

        //创建3个学生对象，年龄分别是20、19、21，并将他们依次放入List中
        Student s1 = new Student();
        s1.setAge(20);
        Student s2 = new Student();
        s2.setAge(19);
        Student s3 = new Student();
        s3.setAge(21);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println("排序前：" + list);
        Collections.sort(list, Comparator.comparing(Student::getAge));
        System.out.println("排序后：" + list);
    }
}

class Student {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getAge() + "";
    }
}
