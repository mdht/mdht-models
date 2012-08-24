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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Order Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationOrderNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationOrderExpiration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Expiration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationQuantityOrdered(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Ordered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationPrescriptionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Prescription Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationAssigningAuthority(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Assigning Authority</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationDispenseDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispense Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationDispensingPharmacyLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispensing Pharmacy Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationQuantityDispensed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Dispensed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationOrderInformationOperations extends SupplyEntryOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationOrderInformationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationOrderNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Number</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationOrderNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::INT implies self.id->size() > 0";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationOrderNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationOrderNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationOrderNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ORDER_NUMBER,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationOrderNumber"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationOrderExpiration(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Expiration</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationOrderExpiration(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode =  vocab::x_DocumentSubstanceMood::INT implies not self.effectiveTime->select(et | et.value.oclIsUndefined())->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationOrderExpiration(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Expiration</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationOrderExpiration(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationOrderExpiration(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationOrderExpiration"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationQuantityOrdered(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Ordered</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationQuantityOrdered(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity.value.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationQuantityOrdered(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Ordered</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationQuantityOrdered(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationQuantityOrdered(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationQuantityOrdered"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationQuantityUnit(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Unit</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationQuantityUnit(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity.unit.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationQuantityUnit(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Unit</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationQuantityUnit(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationQuantityUnit(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationQuantityUnit"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationPrescriptionNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Prescription Number</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationPrescriptionNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.id->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationPrescriptionNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Prescription Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationPrescriptionNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationPrescriptionNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationPrescriptionNumber"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationAssigningAuthority(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Assigning Authority</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationAssigningAuthority(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.root->size() > 0";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationAssigningAuthority(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Assigning Authority</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationAssigningAuthority(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationAssigningAuthority(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationAssigningAuthority"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationDispenseDate(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispense Date</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationDispenseDate(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies self.effectiveTime->size() > 0";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationDispenseDate(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispense Date</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationDispenseDate(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationDispenseDate(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_DISPENSE_DATE,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationDispenseDate"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationDispensingPharmacyLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispensing Pharmacy Location</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationDispensingPharmacyLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode =  vocab::x_DocumentSubstanceMood::EVN  implies self.performer->select(p | p.assignedEntity.addr->isEmpty())->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationDispensingPharmacyLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispensing Pharmacy Location</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationDispensingPharmacyLocation(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationDispensingPharmacyLocation(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationDispensingPharmacyLocation"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationQuantityDispensed(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Dispensed</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationQuantityDispensed(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentSubstanceMood::EVN implies not self.quantity.value.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationQuantityDispensed(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Dispensed</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationQuantityDispensed(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationQuantityDispensed(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationQuantityDispensed"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationHasFillNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Fill Number</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationHasFillNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP and er.sequenceNumber.oclIsUndefined())->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationHasFillNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Fill Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationHasFillNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationHasFillNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationHasFillNumber"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationTemplateId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationTemplateId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.3')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationTemplateId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationTemplateId(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationTemplateId(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_TEMPLATE_ID,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationTemplateId"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationRepeatNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Repeat Number</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationRepeatNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationRepeatNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Repeat Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationRepeatNumber(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationRepeatNumber(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationRepeatNumber"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationStatusCodeP(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationStatusCodeP(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationStatusCodeP(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationStatusCodeP(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicationOrderInformationStatusCodeP(MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_STATUS_CODE_P,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationStatusCodeP"),
             new Object [] { medicationOrderInformation }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformationStatusCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformationStatusCodeP", passToken);
        }
        passToken.add(medicationOrderInformation);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicationOrderInformationStatusCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationStatusCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'aborted' or value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationOrderInformationStatusCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationOrderInformationStatusCode(MedicationOrderInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicationOrderInformation The receiving '<em><b>Medication Order Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateMedicationOrderInformationStatusCode(
			MedicationOrderInformation medicationOrderInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformationStatusCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationOrderInformation)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION);
      try
      {
        VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationOrderInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.MEDICATION_ORDER_INFORMATION__MEDICATION_ORDER_INFORMATION_STATUS_CODE,
             HITSPPlugin.INSTANCE.getString("MedicationOrderInformationStatusCode"),
             new Object [] { medicationOrderInformation }));
      }
       
      return false;
    }
    return true;
  }

} // MedicationOrderInformationOperations
