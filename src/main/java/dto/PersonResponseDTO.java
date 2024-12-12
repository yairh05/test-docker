package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PersonResponseDTO {

    @JsonProperty("data")
    private List<PersonData> data;

    public List<PersonData> getData() {
        return data;
    }

    public void setData(List<PersonData> data) {
        this.data = data;
    }

    public static class         PersonData {
        @JsonProperty("id")
        private String id;

        @JsonProperty("identifier")
        private List<Identifier> identifier;

        @JsonProperty("name")
        private NameWrapper name;

        @JsonProperty("gender")
        private String gender;

        @JsonProperty("birthDate")
        private String birthDate;

        @JsonProperty("age")
        private int age;

        @JsonProperty("maritalStatus")
        private MaritalStatus maritalStatus;

        @JsonProperty("extension")
        private List<Extension> extension;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Identifier> getIdentifier() {
            return identifier;
        }

        public void setIdentifier(List<Identifier> identifier) {
            this.identifier = identifier;
        }

        public NameWrapper getName() {
            return name;
        }

        public void setName(NameWrapper name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public MaritalStatus getMaritalStatus() {
            return maritalStatus;
        }

        public void setMaritalStatus(MaritalStatus maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public List<Extension> getExtension() {
            return extension;
        }

        public void setExtension(List<Extension> extension) {
            this.extension = extension;
        }

        public static class Identifier {
            @JsonProperty("type")
            private String type;

            @JsonProperty("value")
            private String value;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class NameWrapper {
            @JsonProperty("name")
            private Name name;

            public Name getName() {
                return name;
            }

            public void setName(Name name) {
                this.name = name;
            }

            public static class Name {
                @JsonProperty("text")
                private String text;

                @JsonProperty("firstName")
                private String firstName;

                @JsonProperty("secondName")
                private String secondName;

                @JsonProperty("firstFamily")
                private String firstFamily;

                @JsonProperty("secondFamily")
                private String secondFamily;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getFirstName() {
                    return firstName;
                }

                public void setFirstName(String firstName) {
                    this.firstName = firstName;
                }

                public String getSecondName() {
                    return secondName;
                }

                public void setSecondName(String secondName) {
                    this.secondName = secondName;
                }

                public String getFirstFamily() {
                    return firstFamily;
                }

                public void setFirstFamily(String firstFamily) {
                    this.firstFamily = firstFamily;
                }

                public String getSecondFamily() {
                    return secondFamily;
                }

                public void setSecondFamily(String secondFamily) {
                    this.secondFamily = secondFamily;
                }
            }
        }

        public static class MaritalStatus {
            @JsonProperty("code")
            private int code;

            @JsonProperty("display")
            private String display;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public String getDisplay() {
                return display;
            }

            public void setDisplay(String display) {
                this.display = display;
            }
        }

        public static class Extension {
            @JsonProperty("valueAddress")
            private ValueAddress valueAddress;

            @JsonProperty("valueCodeableConcept")
            private ValueCodeableConcept valueCodeableConcept;

            @JsonProperty("url")
            private String url;

            public ValueAddress getValueAddress() {
                return valueAddress;
            }

            public void setValueAddress(ValueAddress valueAddress) {
                this.valueAddress = valueAddress;
            }

            public ValueCodeableConcept getValueCodeableConcept() {
                return valueCodeableConcept;
            }

            public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept) {
                this.valueCodeableConcept = valueCodeableConcept;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public static class ValueAddress {
                @JsonProperty("city")
                private CodeName city;

                @JsonProperty("state")
                private CodeName state;

                @JsonProperty("country")
                private CodeName country;

                public CodeName getCity() {
                    return city;
                }

                public void setCity(CodeName city) {
                    this.city = city;
                }

                public CodeName getState() {
                    return state;
                }

                public void setState(CodeName state) {
                    this.state = state;
                }

                public CodeName getCountry() {
                    return country;
                }

                public void setCountry(CodeName country) {
                    this.country = country;
                }

                public static class CodeName {
                    @JsonProperty("code")
                    private String code;

                    @JsonProperty("name")
                    private String name;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }

            public static class ValueCodeableConcept {
                @JsonProperty("coding")
                private List<Coding> coding;

                public List<Coding> getCoding() {
                    return coding;
                }

                public void setCoding(List<Coding> coding) {
                    this.coding = coding;
                }

                public static class Coding {
                    @JsonProperty("system")
                    private String system;

                    @JsonProperty("code")
                    private String code;

                    @JsonProperty("display")
                    private String display;

                    public String getSystem() {
                        return system;
                    }

                    public void setSystem(String system) {
                        this.system = system;
                    }

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getDisplay() {
                        return display;
                    }

                    public void setDisplay(String display) {
                        this.display = display;
                    }
                }
            }
        }
    }

}
