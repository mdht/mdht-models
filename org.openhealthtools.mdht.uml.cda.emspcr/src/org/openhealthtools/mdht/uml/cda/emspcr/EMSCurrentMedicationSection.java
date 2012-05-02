/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Current Medication Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSCurrentMedicationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Current Medications' constraints.validation.error='EMSCurrentMedicationSectionCode' code.codeSystemName='LOINC' code.code='67844-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentlyOnMedication code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Currently on medication' constraints.validation.error='CurrentlyOnMedicationCode' code.codeSystemName='LOINC' code.code='67791-4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionPatientOnAnticoagulants code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='PatientOnAnticoagulantsCode' code.codeSystemName='LOINC' code.code='69749-0'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug code.codeSystem='2.16.840.1.113883.6.88' constraints.validation.error='EMSCurrentMedicationDrugCode' code.codeSystemName='RxNorm'"
 * @generated
 */
public interface EMSCurrentMedicationSection extends Section
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67844-1' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67844-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateEMSCurrentMedicationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSCurrentMedicationSection init();
} // EMSCurrentMedicationSection
