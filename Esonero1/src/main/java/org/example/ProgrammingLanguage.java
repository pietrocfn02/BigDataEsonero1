package org.example;

import com.google.gson.Gson;

public class ProgrammingLanguage {
        private String name;
        private String description;


        public String getJson() {
                Gson g = new Gson();
                return g.toJson(this);
        }

        public ProgrammingLanguage (String name, String description) {
                this.name = name;
                this.description = description;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }
}
