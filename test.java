public class Test {
    public static void main(String[] args)
    {
        Person person=new Person("Alfred","man","programmer",150,178,22);
        Student student=new Student("Alice","0177",6,"Software",22, 4.5);
        person.Show();
        student.AddCourse("Math");
        student.AddCourse("English");
        student.AddCourse("Chinese");
        student.Show();
        student.DeleteCourse("Math");
        student.Show();
        student.AddCourse("IT");
        student.SetAge(21);
        student.Show();
    }
}

class Person
{
    public  Person()
    {
        this.name = "None";
        this.sex = "None";
        this.age = 0;
        this.height = 0;
        this.weight = 0;
        this.major = "None";
    }
    public Person(String name,String sex,String major,int w,int h,int a)
    {
        this.name=name;
        this.sex=sex;
        this.major=major;
        this.age=a;
        this.height=h;
        this.weight=w;
    }
    public void SetName(String name)
    {
        this.name=name;
    }
    public void SetAge(int age)
    {
        this.age=age;
    }
    public void SetJob(String major)
    {
        this.major=major;
    }
    public void Show(){System.out.println("Name is "+this.name+" Sex is "+this.sex);}
    protected String name;
    private String sex;
    private String major;
    private int weight;
    private int height;
    protected int age;
}

class Student extends Person
{
    Student(){}
    public Student(String name,String number,int grade,String academy,int age,double gpa)
    {
        this.name = name;
        this.number = number;
        this.grade = grade;
        this.academy = academy;
        this.age = age;
        this.GPA = gpa;
    }
    public void SetGPA(double gpa)
    {
        this.GPA=gpa;
    }
    public void SetGrade(int grade)
    {
        this.grade=grade;
    }
    public String[] AddCourse(String course)
    {
        this.course[this.size] = course;
        this.size++;
        return this.course;
    }
    public String[] DeleteCourse(String course)
    {
        for(int i=0; i<this.course.length; i++)
        {
            if(course.equals(this.course[i]))
            {
                this.course[i] = null;
            }
        }
        return this.course;
    }
    public void Show()
    {
        System.out.println("GPA:"+this.GPA);
        for(int i=0; i<this.course.length; i++)
        {
            if(this.course[i]!=null)
            System.out.println(" "+this.course[i]);
        }
        System.out.println("Name is "+this.name+" Number is "+this.number+" Academy is "+
                this.academy+" Age is "+this.age);
    }
    public double GPA;
    public String number;
    private String[] course = new String[100];
    public int size=0;
    private int grade;
    private String academy;
}

