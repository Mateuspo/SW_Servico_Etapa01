/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ubiratan
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_cliente", strategy = GenerationType.SEQUENCE)
    @XmlElement(required = true)
    @Column(name = "id")
    private Integer id; 
    
    @XmlElement(required = true)
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;       
    
    @XmlElement(required = true)
    @Column(name = "endereco", length = 100, nullable = false)
    private String endereco;   
    
    @XmlElement(required = true)
    @Column(name = "val_compra", nullable = false, columnDefinition = "numeric(5,2)")
    private Double val_compra; 
    
    @XmlElement(required = true)
    @Column(name = "cep_origem", length=8, nullable = false)
    private String cep_origem; 
    
    @XmlElement(required = true)
    @Column(name = "cep_destino", length=8, nullable = false)
    private String cep_destino; 
    
    @XmlElement(required = true)
    @Column(name = "val_frete", nullable = false, columnDefinition = "numeric(5,2)")
    private Double val_frete;
    
    @XmlElement(required = true)
    @Column(name = "tipo_frete", nullable = false)
    private int tipo_frete;   
    
    @XmlElement(required = true)
    @Column(name = "val_total", nullable = false, columnDefinition = "numeric(5,2)")
    private Double val_total; 
    
    @XmlElement(required = true)
    @Column(name = "prazo_entrega", length = 10, nullable = false)
    private String prazo_entrega; 
   
    @XmlElement(required = true)
    @Column(name = "peso", nullable = false, columnDefinition = "numeric(5,2)")
    private BigDecimal peso;

    @XmlElement(required = true)
    @Column(name = "formato", nullable = false)
    private Integer formato;

    @XmlElement(required = true)
    @Column(name = "comprimento", nullable = false, columnDefinition = "numeric(5,2)")
    private BigDecimal comprimento;

    @XmlElement(required = true)
    @Column(name = "altura", nullable = false, columnDefinition = "numeric(5,2)")
    private BigDecimal altura;

    @XmlElement(required = true)
    @Column(name = "largura", nullable = false, columnDefinition = "numeric(5,2)")
    private BigDecimal largura;

    @XmlElement(required = true)
    @Column(name = "diametro", nullable = false, columnDefinition = "numeric(5,2)")
    private BigDecimal diametro;

    @XmlElement(required = true)
    @Column(name = "maoPropria", length = 1, nullable = false)
    private String maoPropria;

    @XmlElement(required = true)
    @Column(name = "valorDeclarado", nullable = false, columnDefinition = "numeric(5,2)")
    private Double valorDeclarado;

    @XmlElement(required = true)
    @Column(name = "avisoRecebimento", length = 1 , nullable = false)
    private String avisoRecebimento;
    
    public Cliente(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getVal_compra() {
        return val_compra;
    }

    public void setVal_compra(Double val_compra) {
        this.val_compra = val_compra;
    }

    public String getCep_origem() {
        return cep_origem;
    }

    public void setCep_origem(String cep_origem) {
        this.cep_origem = cep_origem;
    }

    public String getCep_destino() {
        return cep_destino;
    }

    public void setCep_destino(String cep_destino) {
        this.cep_destino = cep_destino;
    }

    public Double getVal_frete() {
        return val_frete;
    }
    
    public void setVal_frete(Double val_frete) {
        this.val_frete = val_frete;
    }

    public int getTipo_frete() {
        return tipo_frete;
    }

    public void setTipo_frete(int tipo_frete) {
        this.tipo_frete = tipo_frete;
    }
    
    public Double getVal_total() {
        return val_total;
    }

    public void setVal_total(Double val_total) {
        this.val_total = val_total;
    }

    public String getPrazo_entrega() {
        return prazo_entrega;
    }

    public void setPrazo_entrega(String prazo_entrega) {
        this.prazo_entrega = prazo_entrega;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Integer getFormato() {
        return formato;
    }

    public void setFormato(Integer formato) {
        this.formato = formato;
    }

    public BigDecimal getComprimento() {
        return comprimento;
    }

    public void setComprimento(BigDecimal comprimento) {
        this.comprimento = comprimento;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getLargura() {
        return largura;
    }

    public void setLargura(BigDecimal largura) {
        this.largura = largura;
    }

    public BigDecimal getDiametro() {
        return diametro;
    }

    public void setDiametro(BigDecimal diametro) {
        this.diametro = diametro;
    }

    public String getMaoPropria() {
        return maoPropria;
    }

    public void setMaoPropria(String maoPropria) {
        this.maoPropria = maoPropria;
    }

    public Double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(Double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public String getAvisoRecebimento() {
        return avisoRecebimento;
    }

    public void setAvisoRecebimento(String avisoRecebimento) {
        this.avisoRecebimento = avisoRecebimento;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

   }
