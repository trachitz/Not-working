package model;
    import java.util.ArrayList;

    public class Repair extends Branch {

        String Name;

        String Mechanic;

        String Appointment_Time;

        String To_Do ;

        double Estimated_Budget;

        String Remark;

        Boolean Insurance;
        ArrayList<Repair>repairs;

        public ArrayList<Repair> getRepairs() {
            return repairs;
        }

        public void setRepairs(ArrayList<Repair> repairs) {
            this.repairs = repairs;
        }

        public Repair(ArrayList<Repair> repairs) {
            this.repairs = repairs;
        }

        public Repair(Boolean insurance) {
            Insurance = insurance;
        }

        public Boolean getInsurance() {
            return Insurance;
        }

        public void setInsurance(Boolean insurance) {
            Insurance = insurance;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getMechanic() {
            return Mechanic;
        }

        public void setMechanic(String mechanic) {
            Mechanic = mechanic;
        }

        public String getAppointment_Time() {
            return Appointment_Time;
        }

        public void setAppointment_Time(String appointment_Time) {
            Appointment_Time = appointment_Time;
        }

        public String getTo_Do() {
            return To_Do;
        }

        public void setTo_Do(String to_Do) {
            To_Do = to_Do;
        }

        public double getEstimated_Budget() {
            return Estimated_Budget;
        }

        public void setEstimated_Budget(double estimated_Budget) {
            Estimated_Budget = estimated_Budget;
        }

        public String getRemark() {
            return Remark;
        }

        public void setRemark(String remark) {
            Remark = remark;
        }

        public Repair(String name, String mechanic, String appointment_Time, String to_Do, double estimated_Budget, String remark, Boolean insurance) {
            Name = name;
            Mechanic = mechanic;
            Appointment_Time = appointment_Time;
            To_Do = to_Do;
            Estimated_Budget = estimated_Budget;
            Remark = remark;
            Insurance = insurance;
        }

        public Repair(String name, String mechanic, String appointment_Time, String to_Do, double estimated_Budget, String remark) {
            Name = name;
            Mechanic = mechanic;
            Appointment_Time = appointment_Time;
            To_Do = to_Do;
            Estimated_Budget = estimated_Budget;
            Remark = remark;

        }
    }





