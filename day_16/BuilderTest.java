package day_16;

class Student {

    private String name;
    private int age;
    private String course;
    private String address;

    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.course = builder.course;
        this.address = builder.address;
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String course;
        private String address;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

public class BuilderTest {
    public static void main(String[] args) {

        Student student = new Student.StudentBuilder()
                .setName("Amit")
                .setAge(22)
                .setCourse("Java")
                .build();
    }
}

// -> Builder vs Constructor
//| Builder           | Constructor |
//| ----------------- | ----------- |
//| Readable          | Confusing   |
//| Optional fields   | Fixed order |
//| Immutable objects | Hard        |

//Builder in JDK
//StringBuilder
//StringBuffer
//Locale.Builder


