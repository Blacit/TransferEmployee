package innotechum.task1.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class trash {
                /*List<BigDecimal> temp = new ArrayList<BigDecimal>();
            BigDecimal sal = new BigDecimal(0);
                for (Department dep : departments.values()) {
                    // делаем список зп первого отдела
                    dep.getEmployeeList().forEach((c) -> temp.add(c.getSalary()));
                    // открываем первый отдел
                    if (avgEmp.get(0).compareTo(avgEmp.get(1)) > 0) {
                        // сверяем зп
                        if (sal.compareTo(temp.get(0)) < 0){
                            sal = temp.get(0);
                    }
                }
            }
            System.out.println(sal);*/
    // Находим сотрудника в отделе с наибольшей средней зп,
    // который будет иметь зп между двумя средними отделов



            /*if (avgEmp.get(0) > avgEmp.get(1)) {
                for (Department dep : departments.values()) {
                    if (avgEmployee > departments.values().getEmployeeList(){
                        Double avgEmployee = dep.salaryAvg();
                    }
                    avgEmp.add(avg);
                    System.out.println("Средняя заработная плата отдела " + dep.getName   () + ": " + avg);
                }
            }*/

    //for (Map.Entry<String, Department> entry : departments.entrySet()) {
    //    if(avgEmployee > entry.getValue().getEmployeeList().forEach((c)));
    // тут продолжение
    //}

            /*List<BigDecimal> salarys1 = new ArrayList<>();
            Double avgEmployee = 0.0;
            for (Map.Entry<String, Department> entry : departments.entrySet()) {
                String key = entry.getKey();
                entry.getValue().getEmployeeList().forEach((c) -> salarys1.add(c.getSalary()));
                if (key.equals("Первый")) {
                    for (BigDecimal number : salarys1) {
                        System.out.println(number);
                    }
                }
                if (key.equals("Второй")) {*/

    //}
    //systemMessage(2);

    //}
    //}
    //for (Double number : salarys) {
    //    System.out.println(number);

    //for (Map.Entry<String, Department> entry : departments.entrySet())
    //   System.out.println(entry.getKey() + " - " + entry.getValue());

                /*String key;
            if (avgEmp.get(0).compareTo(avgEmp.get(1)) > 0) {
                key = "Первый отдел имеет большую среднюю зп";
            } else {
                key = "Второй отдел имеет большую среднюю зп";
            }
            System.out.println(empswap(departments, key, avgEmp));*/

    public static BigDecimal empswap(Map<String, Departament> departments, String key, List<BigDecimal> avgEmp) {
        BigDecimal sal = new BigDecimal(0);
        List<BigDecimal> temp = new ArrayList<>();

        for (Departament dep : departments.values()) {
            if (key.equals("Первый отдел имеет большую среднюю зп") && dep.getName().equals("Первый")) {
                int i = 0;
                // Сохраняю в List данные о зп первого отдела
                dep.getEmployeeList().forEach((c) -> temp.add(c.getSalary()));
                for (BigDecimal number : temp) {
                    // Ищу макс. зп, которая находится между двух средних зп по отделам
                    if (temp.get(i).compareTo(avgEmp.get(0)) > 0 && temp.get(i).compareTo(avgEmp.get(1)) > 0) {
                        sal = temp.get(i);
                    }
                    i++;
                }
                break;
            }
            if (key.equals("Второй отдел имеет большую среднюю зп") && dep.getName().equals("Второй")) {
                int i = 0;
                // Сохраняю в List данные о зп первого отдела
                dep.getEmployeeList().forEach((c) -> temp.add(c.getSalary()));
                for (BigDecimal number : temp) {
                    // Ищу макс. зп, которая находится между двух средних зп по отделам
                    if (temp.get(i).compareTo(avgEmp.get(0)) > 0 && temp.get(i).compareTo(avgEmp.get(1)) > 0) {
                        sal = temp.get(i);
                    }
                    i++;
                }
                break;
            }
            //else continue;
        }
        return sal;
    }
}
