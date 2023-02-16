package model;

import java.util.ArrayList;

    public class Head_Branch {
        String name;
        String location;
        int branch_number;
        ArrayList<Head_Branch>head_branches;

        public ArrayList<Head_Branch> getHead_branches() {
            return head_branches;
        }

        public void setHead_branches(ArrayList<Head_Branch> head_branches) {
            this.head_branches = head_branches;
        }

        public Head_Branch(ArrayList<Head_Branch> head_branches) {
            this.head_branches = head_branches;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getBranch_number() {
            return branch_number;
        }

        public void setBranch_number(int branch_number) {
            this.branch_number = branch_number;
        }

        public Head_Branch(String name, String location, int branch_number) {
            this.name = name;
            this.location = location;
            this.branch_number = branch_number;
        }
    }

