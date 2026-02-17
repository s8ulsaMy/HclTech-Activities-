public class Activity_2 {
public static void main(String[] args) {
// Example inputs
double income = 650000;
boolean isWoman = true;
double taxRate = 0;

if (isWoman) {
// Tax slabs for Women
if (income <= 190000) {
taxRate = 0;
} else if (income <= 500000) {
taxRate = 10;
} else if (income <= 800000) {
taxRate = 20;
} else {
taxRate = 30;
}
} else {
// Tax slabs for General
if (income <= 180000) {
taxRate = 0;
} else if (income <= 500000) {
taxRate = 10;
} else if (income <= 800000) {
taxRate = 20;
} else {
taxRate = 30;
}
}

System.out.println("Income: " + income);
System.out.println("Applicable Tax Rate: " + taxRate + "%");
}
}