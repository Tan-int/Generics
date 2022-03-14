import java.util.ArrayList;

// The <T> is our type parameter. The T represents a parameter, and we are able to determine the type of parameter upon instantiation
// Java has a mechanism where we can set the upper bound of a type parameter, which we did by extending the professor class
// Now, the type parameter can be only of type Professor.
// If we didn't, then any Object (String, Integer, Double) can be the type parameter which is irrelevant to a department
public class Department<T extends Professor>{
    /*
    The array list maintains a list of professors, so it can hold objects of the classes we created:
    CSCIProfessors, ArtProfessors, and ScienceProfessors.
    The list can hold all three types of professors if we declared it as: ArrayList<Professor> professorList = new ArrayList<>(); but this isn't what we want
    We can be more specific by setting the type parameter as we did below with <T>
     */
    private ArrayList<T> professorList = new ArrayList<>();
    private String name;

    public Department(String name) {
        this.name = name;
    }

    //CLASS METHODS

    public boolean addProfessor(T professor) {
        if(professorList.contains(professor)) {
            System.out.println(professor.getName() + " is already in the "
                    + name + " department list");
            return false;
        }

        professorList.add(professor);
        System.out.println("\n" + professor.getName() + " added to the " + name + " department list");
        return true;
    }

    public boolean removeProfessor(Professor professor) {
        if(professorList.contains(professor)) {
            System.out.println(professor.getName() + " has been removed from the "
                    + name + " department list");
            professorList.remove(professor);
            return true;
        }

        System.out.println(professor.getName() + " not found in the " + name + " department list");
        return false;
    }

    /* Lets pretend at this university, departments can only set meetings with departments from the same school
    * Ex: The computer science department can set meetings with the information technology department since they
    * both belong to the School of Engineering
    * So we use generics to restrict the type of parameter being passed
    * */
    public void meet(Department<T> department) {
        System.out.println("\n" + name + " department set a meeting with the " + department.name + " department");
    }

    public int size() {
        return professorList.size();
    }

    //PRINTING METHODS

    public void professorList() {
        System.out.println("\n------- " + name + " -------");
        for(T professors: professorList) {
            System.out.println(professors);
        }
    }
}
