/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vehicle Impact Area</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleImpactAreaOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpactAreaOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaTemplateId(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaTemplateId(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.54')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaTemplateId(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaTemplateId(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleImpactAreaTemplateId(VehicleImpactArea vehicleImpactArea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaTemplateId"), new Object[] { vehicleImpactArea }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaMoodCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaMoodCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaMoodCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaMoodCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleImpactAreaMoodCode(VehicleImpactArea vehicleImpactArea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaMoodCode"), new Object[] { vehicleImpactArea }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67497-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleImpactAreaCode(VehicleImpactArea vehicleImpactArea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_CODE,
					EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaCode"), new Object[] { vehicleImpactArea }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaValue(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaValue(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA10137-0' or value.code = 'LA10138-8' or value.code = 'LA10139-6' or value.code = 'LA10140-4' or value.code = 'LA10141-2' or value.code = 'LA13942-0' or value.code = 'LA14557-5' or value.code = 'LA14558-3' or value.code = 'LA6112-2' or value.code = 'LA6113-0' or value.code = 'LA6114-8' or value.code = 'LA6115-5')))";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaValue(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaValue(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleImpactAreaValue(VehicleImpactArea vehicleImpactArea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_VALUE,
					EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaValue"), new Object[] { vehicleImpactArea }));
			}

			return false;
		}
		return true;
	}

} // VehicleImpactAreaOperations
