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
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolObservationTemplateId(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationTemplateId(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.93')";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolObservationTemplateId(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationTemplateId(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROTOCOL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolObservation The receiving '<em><b>Protocol Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolObservationTemplateId(ProtocolObservation protocolObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_OBSERVATION);
			try {
				VALIDATE_PROTOCOL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_OBSERVATION__PROTOCOL_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ProtocolObservationTemplateId"),
					new Object[] { protocolObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolObservationMoodCode(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationMoodCode(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolObservationMoodCode(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationMoodCode(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROTOCOL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolObservation The receiving '<em><b>Protocol Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolObservationMoodCode(ProtocolObservation protocolObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_OBSERVATION);
			try {
				VALIDATE_PROTOCOL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_OBSERVATION__PROTOCOL_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ProtocolObservationMoodCode"),
					new Object[] { protocolObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolObservationCodeP(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationCodeP(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolObservationCodeP(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationCodeP(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROTOCOL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolObservation The receiving '<em><b>Protocol Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolObservationCodeP(ProtocolObservation protocolObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_OBSERVATION);
			try {
				VALIDATE_PROTOCOL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_OBSERVATION__PROTOCOL_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ProtocolObservationCodeP"), new Object[] { protocolObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservationCodeP", passToken);
				}
				passToken.add(protocolObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolObservationCode(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationCode(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67537-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolObservationCode(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationCode(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROTOCOL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolObservation The receiving '<em><b>Protocol Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolObservationCode(ProtocolObservation protocolObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(protocolObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROTOCOL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_OBSERVATION);
			try {
				VALIDATE_PROTOCOL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_OBSERVATION__PROTOCOL_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("ProtocolObservationCode"), new Object[] { protocolObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolObservationValue(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationValue(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17398-1' or value.code = 'LA17491-4' or value.code = 'LA17492-2' or value.code = 'LA17494-8' or value.code = 'LA17495-5' or value.code = 'LA17496-3' or value.code = 'LA17497-1' or value.code = 'LA17498-9' or value.code = 'LA17499-7' or value.code = 'LA17500-2' or value.code = 'LA17501-0' or value.code = 'LA17502-8' or value.code = 'LA17503-6' or value.code = 'LA17504-4' or value.code = 'LA17505-1' or value.code = 'LA17506-9' or value.code = 'LA17507-7' or value.code = 'LA17508-5' or value.code = 'LA17509-3' or value.code = 'LA17510-1' or value.code = 'LA17511-9' or value.code = 'LA17512-7' or value.code = 'LA17513-5' or value.code = 'LA17514-3' or value.code = 'LA17515-0' or value.code = 'LA17516-8' or value.code = 'LA17517-6' or value.code = 'LA17518-4' or value.code = 'LA17519-2' or value.code = 'LA17520-0' or value.code = 'LA17521-8' or value.code = 'LA17522-6' or value.code = 'LA17523-4' or value.code = 'LA17524-2' or value.code = 'LA17525-9' or value.code = 'LA17526-7' or value.code = 'LA17527-5' or value.code = 'LA17528-3' or value.code = 'LA17529-1' or value.code = 'LA17530-9' or value.code = 'LA17531-7' or value.code = 'LA17532-5' or value.code = 'LA17533-3' or value.code = 'LA17534-1' or value.code = 'LA17535-8' or value.code = 'LA17536-6' or value.code = 'LA17537-4' or value.code = 'LA17538-2' or value.code = 'LA17539-0' or value.code = 'LA17540-8' or value.code = 'LA17541-6' or value.code = 'LA17542-4' or value.code = 'LA17543-2' or value.code = 'LA17544-0' or value.code = 'LA17545-7' or value.code = 'LA17546-5' or value.code = 'LA17547-3' or value.code = 'LA17548-1' or value.code = 'LA17549-9' or value.code = 'LA17550-7' or value.code = 'LA17551-5' or value.code = 'LA17552-3' or value.code = 'LA17553-1' or value.code = 'LA17554-9' or value.code = 'LA17555-6' or value.code = 'LA17556-4' or value.code = 'LA17557-2' or value.code = 'LA17558-0' or value.code = 'LA17559-8' or value.code = 'LA17560-6' or value.code = 'LA17561-4' or value.code = 'LA17562-2' or value.code = 'LA17563-0' or value.code = 'LA17564-8' or value.code = 'LA17565-5' or value.code = 'LA17566-3' or value.code = 'LA17567-1' or value.code = 'LA17568-9' or value.code = 'LA17569-7' or value.code = 'LA17570-5' or value.code = 'LA18269-3' or value.code = 'LA46-8' or value.code = 'LA6630-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolObservationValue(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationValue(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROTOCOL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolObservation The receiving '<em><b>Protocol Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolObservationValue(ProtocolObservation protocolObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_OBSERVATION);
			try {
				VALIDATE_PROTOCOL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_OBSERVATION__PROTOCOL_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("ProtocolObservationValue"), new Object[] { protocolObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolObservationValueP(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationValueP(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolObservationValueP(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolObservationValueP(ProtocolObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROTOCOL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolObservation The receiving '<em><b>Protocol Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolObservationValueP(ProtocolObservation protocolObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_OBSERVATION);
			try {
				VALIDATE_PROTOCOL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_OBSERVATION__PROTOCOL_OBSERVATION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("ProtocolObservationValueP"), new Object[] { protocolObservation }));
			}

			return false;
		}
		return true;
	}

} // ProtocolObservationOperations
