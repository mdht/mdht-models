/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection#validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Admission Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection#validateHITSPHospitalAdmissionDiagnosisSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Admission Diagnosis Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionDiagnosisSectionOperations extends
		org.openhealthtools.mdht.uml.cda.ihe.operations.HospitalAdmissionDiagnosisSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HospitalAdmissionDiagnosisSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Admission Diagnosis Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.110')";

	/**
   * The cached OCL invariant for the '{@link #validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Admission Diagnosis Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hospitalAdmissionDiagnosisSection The receiving '<em><b>Hospital Admission Diagnosis Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);
      try
      {
        VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosisSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID,
             HITSPPlugin.INSTANCE.getString("HITSPHospitalAdmissionDiagnosisSectionTemplateId"),
             new Object [] { hospitalAdmissionDiagnosisSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHITSPHospitalAdmissionDiagnosisSectionCondition(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Admission Diagnosis Section Condition</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPHospitalAdmissionDiagnosisSectionCondition(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::Condition))";

	/**
   * The cached OCL invariant for the '{@link #validateHITSPHospitalAdmissionDiagnosisSectionCondition(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Admission Diagnosis Section Condition</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPHospitalAdmissionDiagnosisSectionCondition(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hospitalAdmissionDiagnosisSection The receiving '<em><b>Hospital Admission Diagnosis Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHITSPHospitalAdmissionDiagnosisSectionCondition(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);
      try
      {
        VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosisSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION,
             HITSPPlugin.INSTANCE.getString("HITSPHospitalAdmissionDiagnosisSectionCondition"),
             new Object [] { hospitalAdmissionDiagnosisSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getCondition(HospitalAdmissionDiagnosisSection) <em>Get Condition</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCondition(HospitalAdmissionDiagnosisSection)
   * @generated
   * @ordered
   */
	protected static final String GET_CONDITION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::Condition))->asSequence()->any(true).oclAsType(hitsp::Condition)";

	/**
   * The cached OCL query for the '{@link #getCondition(HospitalAdmissionDiagnosisSection) <em>Get Condition</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCondition(HospitalAdmissionDiagnosisSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_CONDITION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static Condition getCondition(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection) {
    if (GET_CONDITION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(HITSPPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION, HITSPPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION.getEAllOperations().get(61));
      try
      {
        GET_CONDITION__EOCL_QRY = helper.createQuery(GET_CONDITION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CONDITION__EOCL_QRY);
    return (Condition) query.evaluate(hospitalAdmissionDiagnosisSection);
  }

} // HospitalAdmissionDiagnosisSectionOperations
