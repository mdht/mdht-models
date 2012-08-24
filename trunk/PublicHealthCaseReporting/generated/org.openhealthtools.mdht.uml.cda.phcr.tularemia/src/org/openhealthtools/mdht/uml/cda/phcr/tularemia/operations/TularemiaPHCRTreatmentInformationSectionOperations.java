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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrTreatmentInformationSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection#validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Treatment Information Section Tularemia Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection#getTularemiaTherapeuticRegimenAct() <em>Get Tularemia Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaPHCRTreatmentInformationSectionOperations extends PhcrTreatmentInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TularemiaPHCRTreatmentInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Treatment Information Section Tularemia Therapeutic Regimen Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(tularemia::TularemiaTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Treatment Information Section Tularemia Therapeutic Regimen Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaPHCRTreatmentInformationSection The receiving '<em><b>PHCR Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection tularemiaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT,
             TularemiaPlugin.INSTANCE.getString("TularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct"),
             new Object [] { tularemiaPHCRTreatmentInformationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection) <em>Get Tularemia Therapeutic Regimen Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(tularemia::TularemiaTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(tularemia::TularemiaTherapeuticRegimenAct)";

	/**
   * The cached OCL query for the '{@link #getTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection) <em>Get Tularemia Therapeutic Regimen Act</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TularemiaTherapeuticRegimenAct getTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection tularemiaPHCRTreatmentInformationSection) {
    if (GET_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION, TularemiaPackage.Literals.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION.getEAllOperations().get(63));
      try
      {
        GET_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY = helper.createQuery(GET_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY);
    return (TularemiaTherapeuticRegimenAct) query.evaluate(tularemiaPHCRTreatmentInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(TularemiaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(TularemiaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.20')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(TularemiaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(TularemiaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaPHCRTreatmentInformationSection The receiving '<em><b>PHCR Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrTreatmentInformationSectionTemplateId(TularemiaPHCRTreatmentInformationSection tularemiaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrTreatmentInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tularemiaPHCRTreatmentInformationSection, context) }),
             new Object [] { tularemiaPHCRTreatmentInformationSection }));
      }
       
      return false;
    }
    return true;
  }

} // TularemiaPHCRTreatmentInformationSectionOperations