
package csuszkaguigrid;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import search.State;
/**
 *
 * @author valyis
 */
public class csuszkaGUI extends javax.swing.JFrame {

    int[][] tabla = {{1,7,4},{6,3,2},{8,0,5}};
    static int N = 3;
    LinkedList<CsuszkaAllapot> megoldas = new LinkedList<>();
    Iterator<CsuszkaAllapot> iter = null;
    int mp = 1;
    javax.swing.JFrame frameSave = null;
    javax.swing.JFrame frameOpen = null;
    javax.swing.JFrame asd = this;
    
    /**
     * Creates new form csuszkaGUI
     */
    public csuszkaGUI() {
        initComponents();
        jTextArea1.setText("blabla");
        gombTomb[0][0] = jButton00; 
        gombTomb[0][1] = jButton01; 
        gombTomb[0][2] = jButton02; 
        gombTomb[1][0] = jButton10; 
        gombTomb[1][1] = jButton11; 
        gombTomb[1][2] = jButton12; 
        gombTomb[2][0] = jButton20; 
        gombTomb[2][1] = jButton21; 
        gombTomb[2][2] = jButton22; 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton00 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButtonMegold = new javax.swing.JButton();
        jButtonLéptet = new javax.swing.JButton();
        jButtonFuttat = new javax.swing.JButton();
        jTextFieldLepeskoz = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuNew = new javax.swing.JMenuItem();
        jMenuItemNewRandom = new javax.swing.JMenuItem();
        jMenuItemOpen = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("8-as csuszka");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jButton00.setText("0");
        jButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton00ActionPerformed(evt);
            }
        });

        jButton01.setText("1");
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });

        jButton02.setText("2");
        jButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton02ActionPerformed(evt);
            }
        });

        jButton10.setText("3");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("4");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("5");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton22.setText("8");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton21.setText("7");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton20.setText("6");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButtonMegold.setText("Megold");
        jButtonMegold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMegoldActionPerformed(evt);
            }
        });

        jButtonLéptet.setText("Léptet");
        jButtonLéptet.setEnabled(false);
        jButtonLéptet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLéptetActionPerformed(evt);
            }
        });

        jButtonFuttat.setText("Futtat");
        jButtonFuttat.setEnabled(false);
        jButtonFuttat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuttatActionPerformed(evt);
            }
        });

        jTextFieldLepeskoz.setText("mp");
        jTextFieldLepeskoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLepeskozActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jMenu2.setText("File");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuNew.setText("New");
        jMenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuNew);

        jMenuItemNewRandom.setText("NewRandom");
        jMenuItemNewRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewRandomActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemNewRandom);

        jMenuItemOpen.setText("Open...");
        jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemOpen);

        jMenuItemSave.setText("Save...");
        jMenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSave);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemExit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLéptet)
                    .addComponent(jButtonMegold)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonFuttat)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldLepeskoz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton00, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMegold))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLéptet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFuttat)
                            .addComponent(jTextFieldLepeskoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewActionPerformed
        for (int i=0; i<N; i++) for (int j=0;j<N;j++)
        {gombTomb[i][j].setText(Integer.toString(i*N+j));
         tabla[i][j]=i*N+j;
        
        }
    }//GEN-LAST:event_jMenuNewActionPerformed

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton00ActionPerformed
          int i = 0;
          int j = 0;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }          
    }//GEN-LAST:event_jButton00ActionPerformed

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
          int i = 0;
          int j = 1;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton02ActionPerformed
          int i = 0;
          int j = 2;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
          int i = 1;
          int j = 0;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
          int i = 1;
          int j = 1;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
          int i = 1;
          int j = 2;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
          int i = 2;
          int j = 0;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
          int i = 2;
          int j = 1;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
          int i = 2;
          int j = 2;
          int k =0, l=0, uj=0;
          cimke: for ( k=0; k<N; k++) for (l=0; l<N; l++) 
              if(tabla[k][l]==0) break cimke;
          if ((i-k)*(i-k)+(j-l)*(j-l) == 1) {
              uj = tabla[i][j];
              tabla[i][j] = 0;
              tabla[k][l] = uj;
          gombTomb[i][j].setText(Integer.toString(0));
          gombTomb[k][l].setText(Integer.toString(uj));
          }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
          jTextArea1.setText(Arrays.deepToString(tabla)+"\n");
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jButtonMegoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMegoldActionPerformed
          CsuszkaAllapot feladat = new CsuszkaAllapot(tabla);
          search.BreadthFirstSolver solver = new search.BreadthFirstSolver();
          megoldas = new LinkedList<>();
          for (State s: solver.solve(feladat)) megoldas.add((CsuszkaAllapot)s);
          iter = megoldas.iterator();
          tabla = iter.next().tabla;
          for (int i=0; i<N;i++) for(int j=0; j<N; j++) 
              gombTomb[i][j].setText(Integer.toString(tabla[i][j]));
          jButtonLéptet.setEnabled(true);
          jButtonFuttat.setEnabled(true);
    }//GEN-LAST:event_jButtonMegoldActionPerformed

    private void jButtonLéptetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLéptetActionPerformed
       if (iter.hasNext()) {
        tabla =  iter.next().tabla;
        for (int i=0; i<N;i++) for(int j=0; j<N; j++) 
              gombTomb[i][j].setText(Integer.toString(tabla[i][j]));
       }
       else jTextArea1.setText("nincs több lépés");
       
    }//GEN-LAST:event_jButtonLéptetActionPerformed

    private void jTextFieldLepeskozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLepeskozActionPerformed
         try {
             mp = Integer.parseInt(jTextArea1.getText());
         }
         catch (NumberFormatException e) {jTextArea1.setText(Integer.toString(mp));}
    }//GEN-LAST:event_jTextFieldLepeskozActionPerformed

    private void jButtonFuttatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuttatActionPerformed
        while (iter.hasNext()) {
        tabla =  iter.next().tabla;
        for (int i=0; i<N;i++) for(int j=0; j<N; j++) 
              gombTomb[i][j].setText(Integer.toString(tabla[i][j]));
            try {
                Thread.sleep(mp*1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(csuszkaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            update(this.getGraphics());
                 
        }
        jTextArea1.setText("nincs több lépés");
    }//GEN-LAST:event_jButtonFuttatActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveActionPerformed
       frameSave=new CsuszkaSave(this);
       frameSave.setVisible(true);
       this.setEnabled(false);
       frameSave.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent){asd.setEnabled(true);}});
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSaveActionPerformed

    private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenActionPerformed
      frameOpen = new CsuszkaOpen(this);
      frameOpen.setVisible(true);
      this.setEnabled(false);
       frameSave.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent){asd.setEnabled(true);}});
    }//GEN-LAST:event_jMenuItemOpenActionPerformed

    private void jMenuItemNewRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewRandomActionPerformed
        int j;
        LinkedList<Integer> eddigiek = new LinkedList();
        Random rg = new Random();
        //rg.setSeed(32394644322190L);
        for (int i=0; i<N*N; i++) {
            do {
                j = rg.nextInt(N*N); System.out.println(j);
            }
            while (eddigiek.contains(j));
            eddigiek.add(j);
            tabla[i/3][i%3]=j;
        }
        for (int k=0; k<N; k++) for (int m=0;m<N;m++)
        {gombTomb[k][m].setText(Integer.toString(tabla[k][m]));
        }
        int inverzioSzam = 0;
        for (int k=0; k<N; k++) for (int m=0; m<N;m++) 
            for (int k2=k; k2<N; k2++) for (int m2=0; m2<N;m2++) 
            if (((k2>k) || (k2==k) && (m2>m)) && tabla[k2][m2]<tabla[k][m]) 
                inverzioSzam++;
        if (inverzioSzam%2==1) System.out.println("Nem megoldható, generálj újat!");
        else System.out.println("inverzioszam: "+inverzioSzam);

    }//GEN-LAST:event_jMenuItemNewRandomActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
      System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemExitActionPerformed

String getTabla() {
      StringBuilder sb = new StringBuilder();
      for (int i=0; i<N; i++) for (int j=0; j<N;j++)
         { sb.append(tabla[i][j]);}
      return sb.toString();

}
void setTabla(String visszatoltes) {
     for (int i=0; i<9; i++) tabla[i/3][i%3] = Integer.parseInt(""+visszatoltes.charAt(i));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(csuszkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(csuszkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(csuszkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(csuszkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override public void run() {
                new csuszkaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButtonFuttat;
    private javax.swing.JButton jButtonLéptet;
    private javax.swing.JButton jButtonMegold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemNewRandom;
    private javax.swing.JMenuItem jMenuItemOpen;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JMenuItem jMenuNew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldLepeskoz;
    // End of variables declaration//GEN-END:variables
    javax.swing.JButton[][] gombTomb = {{jButton00,jButton01,jButton02},{jButton10,jButton11,jButton12},
                                         {jButton20,jButton21,jButton22}};
    
}