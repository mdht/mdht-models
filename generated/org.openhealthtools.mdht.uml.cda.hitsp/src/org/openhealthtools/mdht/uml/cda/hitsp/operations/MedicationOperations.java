/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

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
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationType;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getMedicationType() <em>Get Medication Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getMedicationOrderInformations() <em>Get Medication Order Informations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getHITSPReactionObservation() <em>Get HITSP Reaction Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationOperations extends org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPMedicationTemplateId(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationTemplateId(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPMedicationTemplateId(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationTemplateId(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPMedicationTemplateId(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION);
			try {
				VALIDATE_HITSP_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.MEDICATION__HITSP_MEDICATION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("HITSPMedicationTemplateId"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPMedicationEffectiveTime(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationEffectiveTime(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPMedicationEffectiveTime(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationEffectiveTime(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPMedicationEffectiveTime(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION);
			try {
				VALIDATE_HITSP_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.MEDICATION__HITSP_MEDICATION_EFFECTIVE_TIME,
						 HITSPPlugin.INSTANCE.getString("HITSPMedicationEffectiveTime"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPMedicationRouteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationRouteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in ("+
"not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPMedicationRouteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationRouteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPMedicationRouteCode(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION);
			try {
				VALIDATE_HITSP_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.MEDICATION__HITSP_MEDICATION_ROUTE_CODE,
						 HITSPPlugin.INSTANCE.getString("HITSPMedicationRouteCode"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPMedicationDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPMedicationDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPMedicationDoseQuantity(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION);
			try {
				VALIDATE_HITSP_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.MEDICATION__HITSP_MEDICATION_DOSE_QUANTITY,
						 HITSPPlugin.INSTANCE.getString("HITSPMedicationDoseQuantity"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPMedicationAdministrationUnitCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Administration Unit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationAdministrationUnitCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in ("+
"not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPMedicationAdministrationUnitCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Administration Unit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationAdministrationUnitCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in (
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPMedicationAdministrationUnitCode(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION);
			try {
				VALIDATE_HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.MEDICATION__HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE,
						 HITSPPlugin.INSTANCE.getString("HITSPMedicationAdministrationUnitCode"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPMedicationMaxDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationMaxDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPMedicationMaxDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationMaxDoseQuantity(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPMedicationMaxDoseQuantity(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION);
			try {
				VALIDATE_HITSP_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.MEDICATION__HITSP_MEDICATION_MAX_DOSE_QUANTITY,
						 HITSPPlugin.INSTANCE.getString("HITSPMedicationMaxDoseQuantity"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPMedicationApproachSiteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationApproachSiteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPMedicationApproachSiteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationApproachSiteCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPMedicationApproachSiteCode(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION);
			try {
				VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.MEDICATION__HITSP_MEDICATION_APPROACH_SITE_CODE,
						 HITSPPlugin.INSTANCE.getString("HITSPMedicationApproachSiteCode"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPMedicationCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPMedicationCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPMedicationCode(Medication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPMedicationCode(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION);
			try {
				VALIDATE_HITSP_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.MEDICATION__HITSP_MEDICATION_CODE,
						 HITSPPlugin.INSTANCE.getString("HITSPMedicationCode"),
						 new Object [] { medication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationType(Medication) <em>Get Medication Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationType(Medication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::MedicationType))->asSequence()->first().oclAsType(hitsp::MedicationType)";

	/**
	 * The cached OCL query for the '{@link #getMedicationType(Medication) <em>Get Medication Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationType(Medication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::MedicationType))->asSequence()->first().oclAsType(hitsp::MedicationType)
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicationType getMedicationType(Medication medication) {
		if (GET_MEDICATION_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.MEDICATION, HITSPPackage.Literals.MEDICATION.getEAllOperations().get(100));
			try {
				GET_MEDICATION_TYPE__EOCL_QRY = helper.createQuery(GET_MEDICATION_TYPE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_TYPE__EOCL_QRY);
		return (MedicationType) query.evaluate(medication);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationOrderInformations(Medication) <em>Get Medication Order Informations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationOrderInformations(Medication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ORDER_INFORMATIONS__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(hitsp::MedicationOrderInformation)).oclAsType(hitsp::MedicationOrderInformation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationOrderInformations(Medication) <em>Get Medication Order Informations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationOrderInformations(Medication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(hitsp::MedicationOrderInformation)).oclAsType(hitsp::MedicationOrderInformation)
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<MedicationOrderInformation> getMedicationOrderInformations(Medication medication) {
		if (GET_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.MEDICATION, HITSPPackage.Literals.MEDICATION.getEAllOperations().get(101));
			try {
				GET_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY = helper.createQuery(GET_MEDICATION_ORDER_INFORMATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationOrderInformation> result = (Collection<MedicationOrderInformation>) query.evaluate(medication);
		return new BasicEList.UnmodifiableEList<MedicationOrderInformation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPReactionObservation(Medication) <em>Get HITSP Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPReactionObservation(Medication)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_REACTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation))->asSequence()->first().oclAsType(ccd::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getHITSPReactionObservation(Medication) <em>Get HITSP Reaction Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPReactionObservation(Medication)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_REACTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation))->asSequence()->first().oclAsType(ccd::ReactionObservation)
	 * @param medication The receiving '<em><b>Medication</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ReactionObservation getHITSPReactionObservation(Medication medication) {
		if (GET_HITSP_REACTION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.MEDICATION, HITSPPackage.Literals.MEDICATION.getEAllOperations().get(102));
			try {
				GET_HITSP_REACTION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HITSP_REACTION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_REACTION_OBSERVATION__EOCL_QRY);
		return (ReactionObservation) query.evaluate(medication);
	}

} // MedicationOperations