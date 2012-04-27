/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Boundary Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation#validateBoundaryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundaryObservationOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected BoundaryObservationOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateBoundaryObservationTemplateId(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationTemplateId(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BOUNDARY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.11')";

	/**
	* The cached OCL invariant for the '{@link #validateBoundaryObservationTemplateId(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationTemplateId(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_BOUNDARY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.11')
	* @param boundaryObservation The receiving '<em><b>Boundary Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateBoundaryObservationTemplateId(BoundaryObservation boundaryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BOUNDARY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BOUNDARY_OBSERVATION);
			try {
				VALIDATE_BOUNDARY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BOUNDARY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BOUNDARY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			boundaryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.BOUNDARY_OBSERVATION__BOUNDARY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("BoundaryObservationTemplateId"),
					new Object[] { boundaryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBoundaryObservationClassCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationClassCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BOUNDARY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	* The cached OCL invariant for the '{@link #validateBoundaryObservationClassCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationClassCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_BOUNDARY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.classCode=vocab::ActClassObservation::OBS
	* @param boundaryObservation The receiving '<em><b>Boundary Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateBoundaryObservationClassCode(BoundaryObservation boundaryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BOUNDARY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BOUNDARY_OBSERVATION);
			try {
				VALIDATE_BOUNDARY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BOUNDARY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BOUNDARY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			boundaryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.BOUNDARY_OBSERVATION__BOUNDARY_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("BoundaryObservationClassCode"),
					new Object[] { boundaryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBoundaryObservationCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BOUNDARY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '113036' and value.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	* The cached OCL invariant for the '{@link #validateBoundaryObservationCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_BOUNDARY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	* let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	* value.code = '113036' and value.codeSystem = '1.2.840.10008.2.16.4')
	* @param boundaryObservation The receiving '<em><b>Boundary Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateBoundaryObservationCode(BoundaryObservation boundaryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BOUNDARY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BOUNDARY_OBSERVATION);
			try {
				VALIDATE_BOUNDARY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BOUNDARY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BOUNDARY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			boundaryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.BOUNDARY_OBSERVATION__BOUNDARY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("BoundaryObservationCode"), new Object[] { boundaryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBoundaryObservationMoodCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationMoodCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BOUNDARY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	* The cached OCL invariant for the '{@link #validateBoundaryObservationMoodCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationMoodCode(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_BOUNDARY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	* @param boundaryObservation The receiving '<em><b>Boundary Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateBoundaryObservationMoodCode(BoundaryObservation boundaryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BOUNDARY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BOUNDARY_OBSERVATION);
			try {
				VALIDATE_BOUNDARY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BOUNDARY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BOUNDARY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			boundaryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.BOUNDARY_OBSERVATION__BOUNDARY_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("BoundaryObservationMoodCode"),
					new Object[] { boundaryObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBoundaryObservationValue(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationValue(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BOUNDARY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	* The cached OCL invariant for the '{@link #validateBoundaryObservationValue(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boundary Observation Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBoundaryObservationValue(BoundaryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_BOUNDARY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))
	* @param boundaryObservation The receiving '<em><b>Boundary Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateBoundaryObservationValue(BoundaryObservation boundaryObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BOUNDARY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BOUNDARY_OBSERVATION);
			try {
				VALIDATE_BOUNDARY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BOUNDARY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BOUNDARY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			boundaryObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.BOUNDARY_OBSERVATION__BOUNDARY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("BoundaryObservationValue"), new Object[] { boundaryObservation }));
			}

			return false;
		}
		return true;
	}

} // BoundaryObservationOperations
