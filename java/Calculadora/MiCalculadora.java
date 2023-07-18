package calculadora;
public class MiCalculadora extends javax.swing.JFrame {
    public float primerNumero;      //variable para almacenar primer valor
    public float segundoNumero;    // variable para almacenar segundo valor
    
    public String operador;        // variable para elegir operacion

    /**
     * Creates new form MiCalculadora
     */
    public MiCalculadora() {             // Creacion de contructor MiCalculadora
        initComponents();                // funcion para inicializar componentes
        
        this.setLocationRelativeTo(null);  // para colocar al centro de la pantalla al correr el programa
        this.setTitle("Mi Calculadora");   // asignacion de titulo
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        input = new javax.swing.JLabel();
        BtnMultiplicacion = new javax.swing.JButton();
        BtnSeis = new javax.swing.JButton();
        BtnCinco = new javax.swing.JButton();
        BtnCuatro = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnTres = new javax.swing.JButton();
        BtnDos = new javax.swing.JButton();
        BtnUno = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnNueve = new javax.swing.JButton();
        BtnOcho = new javax.swing.JButton();
        BtnSiete = new javax.swing.JButton();
        BtnDivicion = new javax.swing.JButton();
        BtnResult = new javax.swing.JButton();
        BtnCero = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        input.setBackground(new java.awt.Color(255, 255, 255));
        input.setFont(new java.awt.Font("MS Gothic", 0, 36)); // NOI18N
        input.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        input.setOpaque(true);

        BtnMultiplicacion.setBackground(new java.awt.Color(255, 255, 255));
        BtnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnMultiplicacion.setText("*");
        BtnMultiplicacion.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicacionActionPerformed(evt);
            }
        });

        BtnSeis.setBackground(new java.awt.Color(255, 255, 255));
        BtnSeis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnSeis.setText("6");
        BtnSeis.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeisActionPerformed(evt);
            }
        });

        BtnCinco.setBackground(new java.awt.Color(255, 255, 255));
        BtnCinco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnCinco.setText("5");
        BtnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCincoActionPerformed(evt);
            }
        });

        BtnCuatro.setBackground(new java.awt.Color(255, 255, 255));
        BtnCuatro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnCuatro.setText("4");
        BtnCuatro.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuatroActionPerformed(evt);
            }
        });

        BtnResta.setBackground(new java.awt.Color(255, 255, 255));
        BtnResta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnResta.setText("-");
        BtnResta.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnTres.setBackground(new java.awt.Color(255, 255, 255));
        BtnTres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnTres.setText("3");
        BtnTres.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTresActionPerformed(evt);
            }
        });

        BtnDos.setBackground(new java.awt.Color(255, 255, 255));
        BtnDos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnDos.setText("2");
        BtnDos.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDosActionPerformed(evt);
            }
        });

        BtnUno.setBackground(new java.awt.Color(255, 255, 255));
        BtnUno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnUno.setText("1");
        BtnUno.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnoActionPerformed(evt);
            }
        });

        BtnSuma.setBackground(new java.awt.Color(255, 255, 255));
        BtnSuma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnSuma.setText("+");
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnNueve.setBackground(new java.awt.Color(255, 255, 255));
        BtnNueve.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnNueve.setText("9");
        BtnNueve.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNueveActionPerformed(evt);
            }
        });

        BtnOcho.setBackground(new java.awt.Color(255, 255, 255));
        BtnOcho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnOcho.setText("8");
        BtnOcho.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOchoActionPerformed(evt);
            }
        });

        BtnSiete.setBackground(new java.awt.Color(255, 255, 255));
        BtnSiete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnSiete.setText("7");
        BtnSiete.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSieteActionPerformed(evt);
            }
        });

        BtnDivicion.setBackground(new java.awt.Color(255, 255, 255));
        BtnDivicion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnDivicion.setText("/");
        BtnDivicion.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnDivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivicionActionPerformed(evt);
            }
        });

        BtnResult.setBackground(new java.awt.Color(255, 255, 255));
        BtnResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnResult.setText("=");
        BtnResult.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResultActionPerformed(evt);
            }
        });

        BtnCero.setBackground(new java.awt.Color(255, 255, 255));
        BtnCero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnCero.setText("0");
        BtnCero.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCeroActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnLimpiar.setText("C");
        BtnLimpiar.setPreferredSize(new java.awt.Dimension(80, 80));
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDivicion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDivicion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
       // manejo de eventos de todos lo botones
    private void BtnUnoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        limpiarInput();
        this.input.setText(this.input.getText() +"1");  // agregamos numero a input      
    }                                      

    private void BtnDosActionPerformed(java.awt.event.ActionEvent evt) {                                       
        limpiarInput();  
        this.input.setText(this.input.getText() +"2");
    }                                      

    private void BtnTresActionPerformed(java.awt.event.ActionEvent evt) {                                        
        limpiarInput();
        this.input.setText(this.input.getText() +"3");
    }                                       

    private void BtnCuatroActionPerformed(java.awt.event.ActionEvent evt) {                                          
        limpiarInput();
        this.input.setText(this.input.getText() +"4");        
    }                                         

    private void BtnCincoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limpiarInput();
        this.input.setText(this.input.getText() +"5");
    }                                        

    private void BtnSeisActionPerformed(java.awt.event.ActionEvent evt) {                                        
        limpiarInput();
        this.input.setText(this.input.getText() +"6");       
    }                                       

    private void BtnSieteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limpiarInput();
        this.input.setText(this.input.getText() +"7");        
    }                                        

    private void BtnOchoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        limpiarInput();
        this.input.setText(this.input.getText() +"8");        
    }                                       

    private void BtnNueveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limpiarInput();
        this.input.setText(this.input.getText() +"9");        
    }                                        

    private void BtnCeroActionPerformed(java.awt.event.ActionEvent evt) {                                        
        limpiarInput();
        this.input.setText(this.input.getText() + "0");        
    }                                       

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.input.setText("");      
    }                                          

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {                                        
     
        this.primerNumero = Float.parseFloat(this.input.getText());   // asignamos el dato de input a primer numero
        this.operador = "+";                                          // asignamos operador 
        this.input.setText("+");                                      // agragamos sibolo de operador a input
        
    }                                       

    private void BtnResultActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.segundoNumero= Float.parseFloat(this.input.getText());  // asignamos el dato de input a segundo numero
        switch(this.operador){                 // switch para realizar las operaciones
            case "+": this.input.setText(enteros( this.primerNumero + this.segundoNumero));break;
            case "-": this.input.setText(enteros( this.primerNumero - this.segundoNumero));break;
            case "*": this.input.setText(enteros( this.primerNumero * this.segundoNumero));break;
            case "/": this.input.setText(enteros( this.primerNumero / this.segundoNumero));break;
        }
    }                                         

    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.primerNumero = Float.parseFloat(this.input.getText());
        this.operador = "-";
        this.input.setText("-");                
       
    }                                        

    private void BtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        this.primerNumero = Float.parseFloat(this.input.getText());
        this.operador = "*";
        this.input.setText("*");        
    }                                                 

    private void BtnDivicionActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.primerNumero = Float.parseFloat(this.input.getText());
        this.operador = "/";
        this.input.setText("/");        
    }                                           

    
    
    public void limpiarInput(){                       // metodo para linpiar input cuado 
       
        if (this.input.getText() == "+" || this.input.getText()== "-" || this.input.getText()=="*"||this.input.getText()=="/" ){
            this.input.setText("");
        
            
        }
       
    }
    
    public String enteros(float resultado){    // metodo para eliminar ceros a la derecha cuando es numero entero
        String result = "";
        result = Float.toString(resultado);
        if(resultado%1 == 0){
            result = result.substring(0,result.length()-2);
            
        }
        return result;
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiCalculadora().setVisible(true);     // crea y muestra el marco
            }
        });
    }
    // Declaracion de variables
    // Variables declaration - do not modify                     
    private javax.swing.JButton BtnCero;
    private javax.swing.JButton BtnCinco;
    private javax.swing.JButton BtnCuatro;
    private javax.swing.JButton BtnDivicion;
    private javax.swing.JButton BtnDos;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnMultiplicacion;
    private javax.swing.JButton BtnNueve;
    private javax.swing.JButton BtnOcho;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnResult;
    private javax.swing.JButton BtnSeis;
    private javax.swing.JButton BtnSiete;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JButton BtnTres;
    private javax.swing.JButton BtnUno;
    private javax.swing.JLabel input;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration                   
}