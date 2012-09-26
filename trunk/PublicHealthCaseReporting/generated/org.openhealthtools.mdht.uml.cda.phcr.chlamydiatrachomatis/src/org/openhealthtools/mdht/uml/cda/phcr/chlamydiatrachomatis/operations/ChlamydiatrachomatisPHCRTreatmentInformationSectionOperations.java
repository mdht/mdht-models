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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util.ChlamydiatrachomatisValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrTreatmentInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection#validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Treatment Information Section Chlamydiatrachomatis Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection#getChlamydiatrachomatisTherapeuticRegimenAct() <em>Get Chlamydiatrachomatis Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations extends PhcrTreatmentInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Treatment Information Section Chlamydiatrachomatis Therapeutic Regimen Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct))";

	/**
   * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Treatment Information Section Chlamydiatrachomatis Therapeutic Regimen Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct))
   * @param chlamydiatrachomatisPHCRTreatmentInformationSection The receiving '<em><b>PHCR Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection chlamydiatrachomatisPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPHCRTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisPHCRTreatmentInformationSection, context) }),
             new Object [] { chlamydiatrachomatisPHCRTreatmentInformationSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection) <em>Get Chlamydiatrachomatis Therapeutic Regimen Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct)";

	/**
   * The cached OCL query for the '{@link #getChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection) <em>Get Chlamydiatrachomatis Therapeutic Regimen Act</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct)
   * @param chlamydiatrachomatisPHCRTreatmentInformationSection The receiving '<em><b>PHCR Treatment Information Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  ChlamydiatrachomatisTherapeuticRegimenAct getChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection chlamydiatrachomatisPHCRTreatmentInformationSection) {
    if (GET_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION.getEAllOperations().get(63));
      try
      {
        GET_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY);
    return (ChlamydiatrachomatisTherapeuticRegimenAct) query.evaluate(chlamydiatrachomatisPHCRTreatmentInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(ChlamydiatrachomatisPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(ChlamydiatrachomatisPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.40')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(ChlamydiatrachomatisPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(ChlamydiatrachomatisPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.40')
   * @param chlamydiatrachomatisPHCRTreatmentInformationSection The receiving '<em><b>PHCR Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrTreatmentInformationSectionTemplateId(ChlamydiatrachomatisPHCRTreatmentInformationSection chlamydiatrachomatisPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPHCRTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrTreatmentInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisPHCRTreatmentInformationSection, context) }),
             new Object [] { chlamydiatrachomatisPHCRTreatmentInformationSection }));
      }
      return false;
    }
    return true;
  }

} // ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations