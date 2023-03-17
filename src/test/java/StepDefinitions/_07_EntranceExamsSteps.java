package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

public class _07_EntranceExamsSteps {
    @Given("Go to Entrance Exams page")
    public void goToEntranceExamsPage() {
    }

    @And("Fill the Create Exam form")
    public void fillTheCreateExamForm(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
    }

    @And("Create a description")
    public void createADescription(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
    }

    @And("Create a note")
    public void createANote(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
    }
}
