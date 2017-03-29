/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petslive.model.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Carlos Eduardo
 */
@Entity
@Table ( name= "administrador")
public class Administrador {
    
    @Id
    @GeneratedValue
    @Column (name = "id_adm", nullable = false)
    private int id_adm;
    
    private String nome_adm;
    private String cpf;
    private String email;
    private String senha;

    
}
