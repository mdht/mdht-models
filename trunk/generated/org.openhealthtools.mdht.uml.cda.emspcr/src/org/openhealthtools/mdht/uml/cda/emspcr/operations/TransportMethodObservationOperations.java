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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transport Method Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportMethodObservationOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected TransportMethodObservationOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateTransportMethodObservationTemplateId(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationTemplateId(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_TRANSPORT_METHOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.34')";

	/**
	* The cached OCL invariant for the '{@link #validateTransportMethodObservationTemplateId(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationTemplateId(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_TRANSPORT_METHOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param transportMethodObservation The receiving '<em><b>Transport Method Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateTransportMethodObservationTemplateId(
			TransportMethodObservation transportMethodObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSPORT_METHOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_METHOD_OBSERVATION);
			try {
				VALIDATE_TRANSPORT_METHOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSPORT_METHOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSPORT_METHOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transportMethodObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.TRANSPORT_METHOD_OBSERVATION__TRANSPORT_METHOD_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("TransportMethodObservationTemplateId"),
					new Object[] { transportMethodObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateTransportMethodObservationCodeP(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationCodeP(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateTransportMethodObservationCodeP(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationCodeP(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param transportMethodObservation The receiving '<em><b>Transport Method Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateTransportMethodObservationCodeP(
			TransportMethodObservation transportMethodObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_METHOD_OBSERVATION);
			try {
				VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transportMethodObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.TRANSPORT_METHOD_OBSERVATION__TRANSPORT_METHOD_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("TransportMethodObservationCodeP"),
					new Object[] { transportMethodObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservationCodeP", passToken);
				}
				passToken.add(transportMethodObservation);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateTransportMethodObservationCode(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationCode(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67549-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateTransportMethodObservationCode(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationCode(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param transportMethodObservation The receiving '<em><b>Transport Method Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateTransportMethodObservationCode(TransportMethodObservation transportMethodObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(transportMethodObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_METHOD_OBSERVATION);
			try {
				VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transportMethodObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.TRANSPORT_METHOD_OBSERVATION__TRANSPORT_METHOD_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("TransportMethodObservationCode"),
					new Object[] { transportMethodObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateTransportMethodObservationValue(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationValue(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17168-8' or value.code = 'LA17169-6' or value.code = 'LA17170-4' or value.code = 'LA17171-2' or value.code = 'LA17172-0' or value.code = 'LA17173-8' or value.code = 'LA17174-6' or value.code = 'LA17175-3' or value.code = 'LA17176-1')))";

	/**
	* The cached OCL invariant for the '{@link #validateTransportMethodObservationValue(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationValue(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param transportMethodObservation The receiving '<em><b>Transport Method Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateTransportMethodObservationValue(
			TransportMethodObservation transportMethodObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_METHOD_OBSERVATION);
			try {
				VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transportMethodObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.TRANSPORT_METHOD_OBSERVATION__TRANSPORT_METHOD_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("TransportMethodObservationValue"),
					new Object[] { transportMethodObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateTransportMethodObservationValueP(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationValueP(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	* The cached OCL invariant for the '{@link #validateTransportMethodObservationValueP(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationValueP(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param transportMethodObservation The receiving '<em><b>Transport Method Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateTransportMethodObservationValueP(
			TransportMethodObservation transportMethodObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_METHOD_OBSERVATION);
			try {
				VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transportMethodObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.TRANSPORT_METHOD_OBSERVATION__TRANSPORT_METHOD_OBSERVATION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("TransportMethodObservationValueP"),
					new Object[] { transportMethodObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateTransportMethodObservationMoodCode(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationMoodCode(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_TRANSPORT_METHOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateTransportMethodObservationMoodCode(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateTransportMethodObservationMoodCode(TransportMethodObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_TRANSPORT_METHOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param transportMethodObservation The receiving '<em><b>Transport Method Observation</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateTransportMethodObservationMoodCode(
			TransportMethodObservation transportMethodObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSPORT_METHOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_METHOD_OBSERVATION);
			try {
				VALIDATE_TRANSPORT_METHOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSPORT_METHOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSPORT_METHOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transportMethodObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.TRANSPORT_METHOD_OBSERVATION__TRANSPORT_METHOD_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("TransportMethodObservationMoodCode"),
					new Object[] { transportMethodObservation }));
			}

			return false;
		}
		return true;
	}

} // TransportMethodObservationOperations
