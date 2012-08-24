/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.hepb.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrTreatmentInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BPHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection#validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Treatment Information Section Acute Hepatitis BTherapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection#getAcuteHepatitisBTherapeuticRegimenAct() <em>Get Acute Hepatitis BTherapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBPHCRTreatmentInformationSectionOperations extends PhcrTreatmentInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AcuteHepatitisBPHCRTreatmentInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Treatment Information Section Acute Hepatitis BTherapeutic Regimen Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hepb::AcuteHepatitisBTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Treatment Information Section Acute Hepatitis BTherapeutic Regimen Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param acuteHepatitisBPHCRTreatmentInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection acuteHepatitisBPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HepbValidator.DIAGNOSTIC_SOURCE,
             HepbValidator.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT,
             HepbPlugin.INSTANCE.getString("AcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct"),
             new Object [] { acuteHepatitisBPHCRTreatmentInformationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection) <em>Get Acute Hepatitis BTherapeutic Regimen Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hepb::AcuteHepatitisBTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBTherapeuticRegimenAct)";

	/**
   * The cached OCL query for the '{@link #getAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection) <em>Get Acute Hepatitis BTherapeutic Regimen Act</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  AcuteHepatitisBTherapeuticRegimenAct getAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection acuteHepatitisBPHCRTreatmentInformationSection) {
    if (GET_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION.getEAllOperations().get(63));
      try
      {
        GET_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__EOCL_QRY);
    return (AcuteHepatitisBTherapeuticRegimenAct) query.evaluate(acuteHepatitisBPHCRTreatmentInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(AcuteHepatitisBPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(AcuteHepatitisBPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.10')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(AcuteHepatitisBPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(AcuteHepatitisBPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param acuteHepatitisBPHCRTreatmentInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrTreatmentInformationSectionTemplateId(AcuteHepatitisBPHCRTreatmentInformationSection acuteHepatitisBPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HepbValidator.DIAGNOSTIC_SOURCE,
             HepbValidator.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrTreatmentInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBPHCRTreatmentInformationSection, context) }),
             new Object [] { acuteHepatitisBPHCRTreatmentInformationSection }));
      }
       
      return false;
    }
    return true;
  }

} // AcuteHepatitisBPHCRTreatmentInformationSectionOperations