package Exercice_5;

import java.time.LocalDate;
import java.util.List;

public class PlanningJournee {
    private LocalDate date;
    private List<MiniExcursionPlanifiee> excusionPlanifiees;

    public PlanningJournee(LocalDate date, List<MiniExcursionPlanifiee> excusionPlanifiees) {
        this.date = date;
        this.excusionPlanifiees = excusionPlanifiees;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<MiniExcursionPlanifiee> getExcusionPlanifiees() {
        return excusionPlanifiees;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setExcusionPlanifiees(List<MiniExcursionPlanifiee> excusionPlanifiees) {
        this.excusionPlanifiees = excusionPlanifiees;
    }
}
