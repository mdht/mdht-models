/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SupplyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Dispense</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseProductContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Product Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#getAssignedEntity() <em>Get Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationDispenseOperations extends SupplyOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationDispenseOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseTemplateId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseTemplateId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.18')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseTemplateId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseTemplateId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.18')
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseTemplateId(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_TEMPLATE_ID,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseTemplateId"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseClassCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseClassCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseClassCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseClassCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode')
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseClassCode(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_CLASS_CODE,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseClassCode"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseEffectiveTime(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseEffectiveTime(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseEffectiveTime(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseEffectiveTime(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseEffectiveTime(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_EFFECTIVE_TIME,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseEffectiveTime"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseId(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseId(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_ID,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseId"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseMoodCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseMoodCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseMoodCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseMoodCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode')
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseMoodCode(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_MOOD_CODE,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseMoodCode"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseRepeatNumber(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseRepeatNumber(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseRepeatNumber(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseRepeatNumber(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseRepeatNumber(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_REPEAT_NUMBER,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseRepeatNumber"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseStatusCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseStatusCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'aborted' or value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseStatusCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseStatusCode(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
   * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
   * value.code = 'aborted' or value.code = 'completed')
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseStatusCode(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_STATUS_CODE,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseStatusCode"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseQuantity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Quantity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseQuantity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseQuantity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseQuantity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseQuantity(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_QUANTITY,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseQuantity"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispensePerformer2(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer2</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispensePerformer2(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispensePerformer2(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer2</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispensePerformer2(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispensePerformer2(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PERFORMER2,
             ConsolPlugin.INSTANCE.getString("MedicationDispensePerformer2"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseAssignedEntity(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_ASSIGNED_ENTITY,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseAssignedEntity"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.product->one(product : cda::Product | not product.oclIsUndefined() and product.oclIsKindOf(cda::Product))
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseProduct(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PRODUCT,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseProduct"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.product->excluding(null)->reject(manufacturedProduct.oclIsTypeOf(consol::MedicationInformation) xor manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation))
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationDispenseProductContainsMedicationOrImmunization(MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_DISPENSE_PRODUCT_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_DISPENSE_PRODUCT_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_DISPENSE_PRODUCT_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationDispense);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_PRODUCT_CONTAINS_MEDICATION_OR_IMMUNIZATION,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseProductContainsMedicationOrImmunization"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseMedicationSupplyOrder(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseAssignedEntity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Assigned Entity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseAssignedEntity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseAssignedEntity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Assigned Entity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseAssignedEntity(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseProduct(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Product</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseProduct(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->one(product : cda::Product | not product.oclIsUndefined() and product.oclIsKindOf(cda::Product))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseProduct(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Product</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseProduct(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_DISPENSE_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateMedicationDispenseProductContainsMedicationOrImmunization(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Product Contains Medication Or Immunization</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseProductContainsMedicationOrImmunization(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_DISPENSE_PRODUCT_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->excluding(null)->reject(manufacturedProduct.oclIsTypeOf(consol::MedicationInformation) xor manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationDispenseProductContainsMedicationOrImmunization(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Product Contains Medication Or Immunization</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationDispenseProductContainsMedicationOrImmunization(MedicationDispense, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_DISPENSE_PRODUCT_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationDispenseMedicationSupplyOrder(MedicationDispense medicationDispense,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.MEDICATION_DISPENSE);
      try
      {
        VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationDispense))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.MEDICATION_DISPENSE__MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER,
             ConsolPlugin.INSTANCE.getString("MedicationDispenseMedicationSupplyOrder"),
             new Object [] { medicationDispense }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))->asSequence()->any(true).oclAsType(cda::AssignedEntity)
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static AssignedEntity getAssignedEntity(MedicationDispense medicationDispense) {
    if (GET_ASSIGNED_ENTITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsolPackage.Literals.MEDICATION_DISPENSE, ConsolPackage.Literals.MEDICATION_DISPENSE.getEAllOperations().get(66));
      try
      {
        GET_ASSIGNED_ENTITY__EOCL_QRY = helper.createQuery(GET_ASSIGNED_ENTITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ASSIGNED_ENTITY__EOCL_QRY);
    return (AssignedEntity) query.evaluate(medicationDispense);
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationSupplyOrder(MedicationDispense) <em>Get Medication Supply Order</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationSupplyOrder(MedicationDispense)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATION_SUPPLY_ORDER__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder)";

	/**
   * The cached OCL query for the '{@link #getMedicationSupplyOrder(MedicationDispense) <em>Get Medication Supply Order</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationSupplyOrder(MedicationDispense)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY;

	/**
   * The cached OCL expression body for the '{@link #getAssignedEntity(MedicationDispense) <em>Get Assigned Entity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAssignedEntity(MedicationDispense)
   * @generated
   * @ordered
   */
	protected static final String GET_ASSIGNED_ENTITY__EOCL_EXP = "self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))->asSequence()->any(true).oclAsType(cda::AssignedEntity)";

	/**
   * The cached OCL query for the '{@link #getAssignedEntity(MedicationDispense) <em>Get Assigned Entity</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAssignedEntity(MedicationDispense)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ASSIGNED_ENTITY__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder)
   * @param medicationDispense The receiving '<em><b>Medication Dispense</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static MedicationSupplyOrder getMedicationSupplyOrder(MedicationDispense medicationDispense) {
    if (GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsolPackage.Literals.MEDICATION_DISPENSE, ConsolPackage.Literals.MEDICATION_DISPENSE.getEAllOperations().get(65));
      try
      {
        GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY = helper.createQuery(GET_MEDICATION_SUPPLY_ORDER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY);
    return (MedicationSupplyOrder) query.evaluate(medicationDispense);
  }

} // MedicationDispenseOperations