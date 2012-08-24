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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrTreatmentInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides PHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection#validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Treatment Information Section Coccidioides Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection#getCoccidioidesTherapeuticRegimenAct() <em>Get Coccidioides Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesPHCRTreatmentInformationSectionOperations extends PhcrTreatmentInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesPHCRTreatmentInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Treatment Information Section Coccidioides Therapeutic Regimen Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(cocci::CoccidioidesTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Treatment Information Section Coccidioides Therapeutic Regimen Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesPHCRTreatmentInformationSection The receiving '<em><b>Coccidioides PHCR Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection coccidioidesPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT,
             CocciPlugin.INSTANCE.getString("CoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct"),
             new Object [] { coccidioidesPHCRTreatmentInformationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection) <em>Get Coccidioides Therapeutic Regimen Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cocci::CoccidioidesTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(cocci::CoccidioidesTherapeuticRegimenAct)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection) <em>Get Coccidioides Therapeutic Regimen Act</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  CoccidioidesTherapeuticRegimenAct getCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection coccidioidesPHCRTreatmentInformationSection) {
    if (GET_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION, CocciPackage.Literals.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION.getEAllOperations().get(63));
      try
      {
        GET_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY);
    return (CoccidioidesTherapeuticRegimenAct) query.evaluate(coccidioidesPHCRTreatmentInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(CoccidioidesPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(CoccidioidesPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.31')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(CoccidioidesPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(CoccidioidesPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesPHCRTreatmentInformationSection The receiving '<em><b>Coccidioides PHCR Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrTreatmentInformationSectionTemplateId(CoccidioidesPHCRTreatmentInformationSection coccidioidesPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrTreatmentInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPHCRTreatmentInformationSection, context) }),
             new Object [] { coccidioidesPHCRTreatmentInformationSection }));
      }
       
      return false;
    }
    return true;
  }

} // CoccidioidesPHCRTreatmentInformationSectionOperations