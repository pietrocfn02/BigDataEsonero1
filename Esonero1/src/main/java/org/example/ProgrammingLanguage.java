package org.example;

import com.google.gson.Gson;

public class ProgrammingLanguage {
        private String name;
        private String description;

        private Integer level;


        public String getJson() {
                Gson g = new Gson();
                return g.toJson(this);
        }

        public ProgrammingLanguage (String name, String description, Integer level) {
                this.name = name;
                this.description = description;
                this.level = level;
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

        public Integer getLevel() {
                return level;
        }

        public void setLevel(Integer level) {
                this.level = level;
        }
}
