/*
    DrMIPS - Educational MIPS simulator
    Copyright (C) 2013-2014 Bruno Nova <ei08109@fe.up.pt>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.feup.brunonova.drmips.gui;

import javax.swing.JOptionPane;
import org.feup.brunonova.drmips.simulator.AppInfo;

/**
 * Dialog that displays information of the program.
 * 
 * @author Bruno Nova
 */
public class DlgAbout extends javax.swing.JDialog {

	/**
	 * Creates new form DlgAbout
	 * @param parent The simulator's main window.
	 */
	public DlgAbout(FrmSimulator parent) {
		super(parent, true);
		initComponents();
		translate();
		getRootPane().setDefaultButton(cmdOk);
		Util.enableCloseWindowWithEscape(this);
		Util.centerWindow(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblVersion = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblDissertation = new javax.swing.JLabel();
        lblFaculty = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdOk = new javax.swing.JButton();
        cmdLicense = new javax.swing.JButton();
        cmdCredits = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("about_program");
        setResizable(false);

        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText(AppInfo.NAME + " " + AppInfo.VERSION);

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/icon_medium.png"))); // NOI18N

        lblAuthor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthor.setText("by_author");

        lblDissertation.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblDissertation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDissertation.setText("for_dissertation");

        lblFaculty.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblFaculty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFaculty.setText(AppInfo.MAIN_AUTHOR_INSTITUTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFaculty, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(lblAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDissertation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVersion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDissertation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFaculty)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        cmdOk.setText("ok");
        cmdOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOkActionPerformed(evt);
            }
        });
        jPanel2.add(cmdOk);

        cmdLicense.setText("license");
        cmdLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLicenseActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLicense);

        cmdCredits.setText("credits");
        cmdCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCreditsActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCredits);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOkActionPerformed
		dispose();
    }//GEN-LAST:event_cmdOkActionPerformed

    private void cmdLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLicenseActionPerformed
		JOptionPane.showMessageDialog(this, AppInfo.LICENSE, Lang.t("license"), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cmdLicenseActionPerformed

    private void cmdCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCreditsActionPerformed
		String credits = AppInfo.getAuthorsAsText() + "\n\n"
			+ Lang.t("external_resources") + ":\n"
			+ "  AutoComplete (http://fifesoft.com/autocomplete/)\n"
			+ "  Humanity Icons (https://launchpad.net/humanity/)\n"
			+ "  JSON.org by Android (https://android.googlesource.com/platform/libcore/+log/master/json/)\n"
			+ "  JTattoo (http://www.jtattoo.net/)\n"
			+ "  RSyntaxTextArea (http://fifesoft.com/rsyntaxtextarea/)";
		JOptionPane.showMessageDialog(this, credits, Lang.t("credits"), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cmdCreditsActionPerformed

	/**
	 * Translates the form's strings.
	 */
	protected final void translate() {
		setTitle(Lang.t("about_program", AppInfo.NAME));
		Lang.tButton(cmdOk, "ok");
		Lang.tButton(cmdLicense, "license");
		Lang.tButton(cmdCredits, "credits");
		lblAuthor.setText(Lang.t("by_author", AppInfo.MAIN_AUTHOR_NAME_EMAIL));
		lblDissertation.setText(Lang.t("for_dissertation"));
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCredits;
    private javax.swing.JButton cmdLicense;
    private javax.swing.JButton cmdOk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblDissertation;
    private javax.swing.JLabel lblFaculty;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblVersion;
    // End of variables declaration//GEN-END:variables
}
