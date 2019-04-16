package com.neuedu.work06;

public class Test {

	
	public static void main(String[] args) {
        Student[] stu = {new English(001, "周浩", '男', 22, 80, 60, 80),
        				 new Computer(002, "当时", '女', 23, 90, 80, 75, 85),
                         new Wenxue(003, "周树人", '男', 30, 80, 100, 95, 95),
                         new English(004, "周华健", '女', 22, 80, 60, 80),
                         new English(005, "周哈哈", '男', 22, 80, 60, 80)};
        Student[] stu1  = new Student[stu.length];


        

        for(int i = 0;i<stu1.length;i++){
            int num = (int)(Math.random()*stu.length);//[0-arr,length)之间的整数
            while(stu[num] == null){
                num = (int)(Math.random()*stu.length);
            }
            stu1[i] = stu[num];
            stu[num] = null ;
        }

        for(int i = 0 ;i<stu1.length;i++){
            stu1[i].showAll();
        }
    }

}
