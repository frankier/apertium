/*
 * Copyright 2015 Jacob Nordfalk
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 */
package apertiumview;

import java.awt.Desktop;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apertium.utils.IOUtils;

public class ApertiumViewAboutBox extends javax.swing.JDialog {

    public ApertiumViewAboutBox(java.awt.Frame parent) {
		super(parent);
		initComponents();
		StringWriter sw = new StringWriter();
		sw.append(Version.getNewVersionMessage());
		sw.append("Apertium Java cahce dir: "+IOUtils.cacheDir);
		sw.append("\n\nJava dir: "+System.getProperty("java.home"));
		sw.append("\n\nPath for external commands:\n"+System.getenv("PATH"));
		sw.append("\n\nJava properties:\n");
		System.getProperties().list(new PrintWriter(sw));
		String envs = System.getenv().toString().replace(", ", "\n").substring(1);
		sw.append("\n\nEnvironment variables:\n"+envs.substring(0, envs.length()-1));
		jTextAreaSystemInfo.setText(sw.toString());
		jTextAreaSystemInfo.setCaretPosition(0);
		appVersionLabel.setText(Version.APERTIUM_VIEWER_VERSION);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
    javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
    javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
    javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
    closeButton = new javax.swing.JButton();
    javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
    javax.swing.JLabel imageLabel = new javax.swing.JLabel();
    appVersionLabel = new javax.swing.JLabel();
    javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
    javax.swing.JLabel versionLabel = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextAreaSystemInfo = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Apertium-viewer");
    setModal(true);
    setName("aboutBox"); // NOI18N

    homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
    homepageLabel.setText("Homepage:");

    appHomepageLabel.setText("<html><a href='http://wiki.apertium.org/wiki/Apertium-viewer'>http://wiki.apertium.org/wiki/Apertium-viewer</a>\n");
    appHomepageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        appHomepageLabelMouseClicked(evt);
      }
    });

    vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
    vendorLabel.setText("Author:");

    appVendorLabel.setText("Jacob Nordfalk");

    closeButton.setMnemonic('C');
    closeButton.setText("Close");
    closeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeButtonActionPerformed(evt);
      }
    });

    appDescLabel.setText("<html>A tool to view and edit the output of the various stages of an apertium translation, and an editor of the source files");

    imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apertiumview/resources/apertium.png"))); // NOI18N

    appVersionLabel.setText("APERTIUM_VIEWER_VERSION");

    appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel.getFont().getSize()+4));
    appTitleLabel.setText("Apertium-viewer");

    versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
    versionLabel.setText("Product Version:");

    jTextAreaSystemInfo.setColumns(20);
    jTextAreaSystemInfo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
    jTextAreaSystemInfo.setRows(5);
    jScrollPane1.setViewportView(jTextAreaSystemInfo);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(imageLabel)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(appDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(closeButton))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(versionLabel)
                  .addComponent(vendorLabel)
                  .addComponent(homepageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(appVersionLabel)
                  .addComponent(appVendorLabel)
                  .addComponent(appHomepageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(appTitleLabel))
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jScrollPane1))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(appTitleLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(appDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(versionLabel)
          .addComponent(appVersionLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(vendorLabel)
          .addComponent(appVendorLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(homepageLabel)
          .addComponent(appHomepageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(closeButton)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    // TODO add your handling code here:
    setVisible(false);
  }//GEN-LAST:event_closeButtonActionPerformed

  private void appHomepageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appHomepageLabelMouseClicked
			try {
				Desktop.getDesktop().browse(new URI("http://wiki.apertium.org/wiki/Apertium-viewer"));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
  }//GEN-LAST:event_appHomepageLabelMouseClicked

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel appVersionLabel;
  private javax.swing.JButton closeButton;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextAreaSystemInfo;
  // End of variables declaration//GEN-END:variables
}
