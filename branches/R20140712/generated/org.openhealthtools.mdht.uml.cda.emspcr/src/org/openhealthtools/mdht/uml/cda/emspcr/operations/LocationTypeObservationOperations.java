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
import org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Location Type Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation#validateLocationTypeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation#validateLocationTypeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation#validateLocationTypeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationTypeObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTypeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLocationTypeObservationTemplateId(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLocationTypeObservationTemplateId(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LOCATION_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.88')";

	/**
	 * The cached OCL invariant for the '{@link #validateLocationTypeObservationTemplateId(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLocationTypeObservationTemplateId(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LOCATION_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param locationTypeObservation The receiving '<em><b>Location Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLocationTypeObservationTemplateId(LocationTypeObservation locationTypeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LOCATION_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LOCATION_TYPE_OBSERVATION);
			try {
				VALIDATE_LOCATION_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			locationTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LOCATION_TYPE_OBSERVATION__LOCATION_TYPE_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("LocationTypeObservationTemplateId"),
					new Object[] { locationTypeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLocationTypeObservationCode(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLocationTypeObservationCode(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LOCATION_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " + "value.code = '74496-1')";

	/**
	 * The cached OCL invariant for the '{@link #validateLocationTypeObservationCode(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLocationTypeObservationCode(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LOCATION_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param locationTypeObservation The receiving '<em><b>Location Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLocationTypeObservationCode(LocationTypeObservation locationTypeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LOCATION_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LOCATION_TYPE_OBSERVATION);
			try {
				VALIDATE_LOCATION_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			locationTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LOCATION_TYPE_OBSERVATION__LOCATION_TYPE_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("LocationTypeObservationCode"),
					new Object[] { locationTypeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLocationTypeObservationValue(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLocationTypeObservationValue(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LOCATION_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.90'))";

	/**
	 * The cached OCL invariant for the '{@link #validateLocationTypeObservationValue(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLocationTypeObservationValue(LocationTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LOCATION_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param locationTypeObservation The receiving '<em><b>Location Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLocationTypeObservationValue(LocationTypeObservation locationTypeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LOCATION_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LOCATION_TYPE_OBSERVATION);
			try {
				VALIDATE_LOCATION_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			locationTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LOCATION_TYPE_OBSERVATION__LOCATION_TYPE_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("LocationTypeObservationValue"),
					new Object[] { locationTypeObservation }));
			}

			return false;
		}
		return true;
	}

} // LocationTypeObservationOperations
