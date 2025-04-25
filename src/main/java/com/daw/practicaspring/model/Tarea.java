package com.daw.practicaspring.model;

public class Tarea {
    int id;
    public String descripcion;
    boolean completada;


        public Tarea(int id, String descripcion, boolean completada) {
            this.id = id;
            this.descripcion = descripcion;
            this.completada = completada;
        }

        public int getId() {
            return id;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public boolean isCompletada() {
            return completada;
        }


        public void setId(int id) {
            this.id = id;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public void setCompletada(boolean completada) {
            this.completada = completada;
        }
    }
