/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection#validateMedicalEquipmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection#validateMedicalEquipmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection#validateMedicalEquipmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection#validateMedicalEquipmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection#validateMedicalEquipmentSectionSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection#validateMedicalEquipmentSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection#getSupplyActivities() <em>Get Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicalEquipmentSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.7')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID,
             CCDPlugin.INSTANCE.getString("MedicalEquipmentSectionTemplateId"),
             new Object [] { medicalEquipmentSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionCode(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionCode(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '46264-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionCode(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionCode(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicalEquipmentSectionCode(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_CODE,
             CCDPlugin.INSTANCE.getString("MedicalEquipmentSectionCode"),
             new Object [] { medicalEquipmentSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionTitle(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionTitle(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionTitle(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionTitle(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicalEquipmentSectionTitle(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TITLE,
             CCDPlugin.INSTANCE.getString("MedicalEquipmentSectionTitle"),
             new Object [] { medicalEquipmentSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionText(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionText(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionText(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionText(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicalEquipmentSectionText(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TEXT,
             CCDPlugin.INSTANCE.getString("MedicalEquipmentSectionText"),
             new Object [] { medicalEquipmentSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionSupplyActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Supply Activity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionSupplyActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(ccd::SupplyActivity))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionSupplyActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Supply Activity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionSupplyActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicalEquipmentSectionSupplyActivity(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_SECTION_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_SUPPLY_ACTIVITY,
             CCDPlugin.INSTANCE.getString("MedicalEquipmentSectionSupplyActivity"),
             new Object [] { medicalEquipmentSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionMedicationActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Medication Activity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionMedicationActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(ccd::MedicationActivity))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionMedicationActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Medication Activity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionMedicationActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicalEquipmentSectionMedicationActivity(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_MEDICATION_ACTIVITY,
             CCDPlugin.INSTANCE.getString("MedicalEquipmentSectionMedicationActivity"),
             new Object [] { medicalEquipmentSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getSupplyActivities(MedicalEquipmentSection) <em>Get Supply Activities</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSupplyActivities(MedicalEquipmentSection)
   * @generated
   * @ordered
   */
	protected static final String GET_SUPPLY_ACTIVITIES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(ccd::SupplyActivity)).oclAsType(ccd::SupplyActivity)";

	/**
   * The cached OCL query for the '{@link #getSupplyActivities(MedicalEquipmentSection) <em>Get Supply Activities</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSupplyActivities(MedicalEquipmentSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SUPPLY_ACTIVITIES__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static EList<SupplyActivity> getSupplyActivities(MedicalEquipmentSection medicalEquipmentSection) {
    if (GET_SUPPLY_ACTIVITIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION, CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION.getEAllOperations().get(61));
      try
      {
        GET_SUPPLY_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_SUPPLY_ACTIVITIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLY_ACTIVITIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SupplyActivity> result = (Collection<SupplyActivity>) query.evaluate(medicalEquipmentSection);
    return new BasicEList.UnmodifiableEList<SupplyActivity>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationActivities(MedicalEquipmentSection) <em>Get Medication Activities</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActivities(MedicalEquipmentSection)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(ccd::MedicationActivity)).oclAsType(ccd::MedicationActivity)";

	/**
   * The cached OCL query for the '{@link #getMedicationActivities(MedicalEquipmentSection) <em>Get Medication Activities</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActivities(MedicalEquipmentSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITIES__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static EList<MedicationActivity> getMedicationActivities(MedicalEquipmentSection medicalEquipmentSection) {
    if (GET_MEDICATION_ACTIVITIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION, CCDPackage.Literals.MEDICAL_EQUIPMENT_SECTION.getEAllOperations().get(62));
      try
      {
        GET_MEDICATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MedicationActivity> result = (Collection<MedicationActivity>) query.evaluate(medicalEquipmentSection);
    return new BasicEList.UnmodifiableEList<MedicationActivity>(result.size(), result.toArray());
  }

} // MedicalEquipmentSectionOperations
