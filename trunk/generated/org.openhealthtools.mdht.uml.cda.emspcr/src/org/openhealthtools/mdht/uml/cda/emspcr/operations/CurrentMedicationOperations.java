/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Current Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationCurrentMedicationConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Current Medication Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateCurrentMedicationNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrentMedicationOperations extends MedicationActivityOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected CurrentMedicationOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationCurrentMedicationConsumable(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Current Medication Consumable</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationCurrentMedicationConsumable(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_CURRENT_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationCurrentMedicationConsumable(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Current Medication Consumable</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationCurrentMedicationConsumable(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_CURRENT_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedication The receiving '<em><b>Current Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationCurrentMedicationConsumable(CurrentMedication currentMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_CURRENT_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION);
			try {
				VALIDATE_CURRENT_MEDICATION_CURRENT_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_CURRENT_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CURRENT_MEDICATION_CURRENT_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION__CURRENT_MEDICATION_CURRENT_MEDICATION_CONSUMABLE,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationCurrentMedicationConsumable"),
					new Object[] { currentMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationDoseQuantity(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Dose Quantity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationDoseQuantity(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationDoseQuantity(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Dose Quantity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationDoseQuantity(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedication The receiving '<em><b>Current Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationDoseQuantity(CurrentMedication currentMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION);
			try {
				VALIDATE_CURRENT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION__CURRENT_MEDICATION_DOSE_QUANTITY,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationDoseQuantity"),
					new Object[] { currentMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationRouteCodeP(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Route Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationRouteCodeP(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationRouteCodeP(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Route Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationRouteCodeP(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedication The receiving '<em><b>Current Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationRouteCodeP(CurrentMedication currentMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION);
			try {
				VALIDATE_CURRENT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENT_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION__CURRENT_MEDICATION_ROUTE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationRouteCodeP"), new Object[] { currentMedication }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationRouteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationRouteCodeP", passToken);
				}
				passToken.add(currentMedication);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationRouteCode(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Route Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationRouteCode(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.3.26.1.1.1' and (value.code = 'C38208' or value.code = 'C38246' or value.code = 'C38216' or value.code = 'C38222' or value.code = 'C38284' or value.code = 'C28161' or value.code = 'C38255' or value.code = 'C38253' or value.code = 'C38276' or value.code = 'C38285' or value.code = 'C38287' or value.code = 'C38288' or value.code = 'C38290' or value.code = 'C38192' or value.code = 'C38295' or value.code = 'C38299' or value.code = 'C38300' or value.code = 'C38304' or value.code = 'C38308' or value.code = 'C38305' or value.code = 'C38271' or value.code = 'NewCode' or value.code = 'C38250'))";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationRouteCode(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Route Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationRouteCode(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedication The receiving '<em><b>Current Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationRouteCode(CurrentMedication currentMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationRouteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(currentMedication)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CURRENT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION);
			try {
				VALIDATE_CURRENT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION__CURRENT_MEDICATION_ROUTE_CODE,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationRouteCode"), new Object[] { currentMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationNegationInd(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Negation Ind</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationNegationInd(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationNegationInd(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Negation Ind</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationNegationInd(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedication The receiving '<em><b>Current Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationNegationInd(CurrentMedication currentMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION);
			try {
				VALIDATE_CURRENT_MEDICATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENT_MEDICATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION__CURRENT_MEDICATION_NEGATION_IND,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationNegationInd"), new Object[] { currentMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateCurrentMedicationNullFlavor(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Null Flavor</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationNullFlavor(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CURRENT_MEDICATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('nullFlavor')";

	/**
	* The cached OCL invariant for the '{@link #validateCurrentMedicationNullFlavor(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Null Flavor</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateCurrentMedicationNullFlavor(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CURRENT_MEDICATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedication The receiving '<em><b>Current Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateCurrentMedicationNullFlavor(CurrentMedication currentMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CURRENT_MEDICATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION);
			try {
				VALIDATE_CURRENT_MEDICATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENT_MEDICATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENT_MEDICATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION__CURRENT_MEDICATION_NULL_FLAVOR,
					EmspcrPlugin.INSTANCE.getString("CurrentMedicationNullFlavor"), new Object[] { currentMedication }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationActivityTemplateId(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.77')";

	/**
	* The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMedicationActivityTemplateId(CurrentMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param currentMedication The receiving '<em><b>Current Medication</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMedicationActivityTemplateId(CurrentMedication currentMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENT_MEDICATION);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			currentMedication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CURRENT_MEDICATION__MEDICATION_ACTIVITY_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MedicationActivityTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(currentMedication, context) }),
					new Object[] { currentMedication }));
			}

			return false;
		}
		return true;
	}

} // CurrentMedicationOperations
