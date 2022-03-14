public class Main {
    public static void main(String[] args) {
        // Instantiating a Department without a type parameter, so any professor objects can be added
        Department department = new Department("Any Professors In Here");

        // Instantiating two Departments with a CSCIProfessor type parameter, so only CSCIProfessor objects can be added
        Department<CSCIProfessor> informationTechnology = new Department("Department of Information Technology");
        Department<CSCIProfessor> computerScience = new Department<>("Department of Computer Science");

        // Instantiating a Department with an Art type parameter, so only Art professor objects can be added
        Department<ArtProfessor> visualArts = new Department("Department of Visual Arts");
        Department<ArtProfessor> performanceArts = new Department<>("Department of Performance Arts");

        // Instantiating a Department with a Science type parameter, so only Science professor objects can be added
        Department<ScienceProfessor> sciences = new Department("Department of Biological Sciences");

        CSCIProfessor omar = new CSCIProfessor("Omar Petzold", "omar@outlook.com", "6559991333");
        CSCIProfessor mark = new CSCIProfessor("Mark Al-Azzam", "mark@outlook.com", "4155552444");
        CSCIProfessor mehdi = new CSCIProfessor("Mehdi Mako", "mehdi@outlook.com", "8126513555");

        ArtProfessor jenny = new ArtProfessor("Jenny Johnson", "jenny@outlook.com", "8126559911");
        ArtProfessor justin = new ArtProfessor("Justin Jackson", "justin@outlook.com", "6126514879");
        ArtProfessor stephanie = new ArtProfessor("Stephanie Scalon", "stephanie@outlook.com", "4533548977");

        ScienceProfessor albert = new ScienceProfessor("Albert Smith", "albert@outlook.com", "77718190023");
        ScienceProfessor janice = new ScienceProfessor("Janice Schmidt", "janice@outlook.com", "8516418899");

        // We can add any type of objects, but we get a warning because we didn't set a type parameter
        // But we have to think, what is the point of having different departments when professors from any department can be added
        department.addProfessor(omar);
        department.addProfessor(jenny);
        department.addProfessor(albert);
        department.professorList();

        // Here the informationTechnology department only deals with objects of type CSCIProfessor
        informationTechnology.addProfessor(omar);
        informationTechnology.addProfessor(mark);
        computerScience.addProfessor(mehdi);
        informationTechnology.professorList();
        computerScience.professorList();
//        informationTechnology.addProfessor(janice); // Error -> Cannot add Art Professor to a department of type CSCIProfessor

        // Now we do the same for the Art department
        visualArts.addProfessor(jenny);
        visualArts.addProfessor(justin);
        performanceArts.addProfessor(stephanie);
        visualArts.professorList();
        performanceArts.professorList();

        // Now for the Science department
        sciences.addProfessor(albert);
        sciences.addProfessor(janice);
        sciences.professorList();

        // Now we will see how Generic methods work as well
        /* Here we have a method called meet() which takes a parameter of the same type parameter as the object calling it
           So we have the informationTechnology object with type parameter <CSCIProfessor> and the same with computerScience, the method works
         */
        informationTechnology.meet(computerScience);
//        informationTechnology.meet(performanceArts); // Error -> performanceArts type parameter is ArtProfessor whereas informationTechnology type paramter is CSCIProfessor
    }
}
