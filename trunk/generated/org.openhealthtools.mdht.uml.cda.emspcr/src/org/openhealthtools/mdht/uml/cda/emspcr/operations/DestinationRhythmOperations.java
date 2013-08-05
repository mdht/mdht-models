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

import org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Destination Rhythm</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm#validateDestinationRhythmTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm#validateDestinationRhythmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm#validateDestinationRhythmValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm#validateDestinationRhythmMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DestinationRhythmOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationRhythmOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationRhythmTemplateId(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationRhythmTemplateId(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.129')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationRhythmTemplateId(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationRhythmTemplateId(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DESTINATION_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationRhythm The receiving '<em><b>Destination Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationRhythmTemplateId(DestinationRhythm destinationRhythm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DESTINATION_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_RHYTHM);
			try {
				VALIDATE_DESTINATION_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			destinationRhythm)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DESTINATION_RHYTHM__DESTINATION_RHYTHM_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("DestinationRhythmTemplateId"), new Object[] { destinationRhythm }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationRhythmCode(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationRhythmCode(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67519-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationRhythmCode(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationRhythmCode(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DESTINATION_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationRhythm The receiving '<em><b>Destination Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationRhythmCode(DestinationRhythm destinationRhythm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DESTINATION_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_RHYTHM);
			try {
				VALIDATE_DESTINATION_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			destinationRhythm)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DESTINATION_RHYTHM__DESTINATION_RHYTHM_CODE,
					EmspcrPlugin.INSTANCE.getString("DestinationRhythmCode"), new Object[] { destinationRhythm }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationRhythmValue(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationRhythmValue(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA12904-1' or value.code = 'LA17059-9' or value.code = 'LA17068-0' or value.code = 'LA17070-6' or value.code = 'LA17071-4' or value.code = 'LA17072-2' or value.code = 'LA17073-0' or value.code = 'LA17074-8' or value.code = 'LA17083-9' or value.code = 'LA17084-7' or value.code = 'LA17085-4' or value.code = 'LA17086-2' or value.code = 'LA17087-0' or value.code = 'LA17088-8' or value.code = 'LA17089-6' or value.code = 'LA17090-4' or value.code = 'LA17091-2' or value.code = 'LA17093-8' or value.code = 'LA17094-6' or value.code = 'LA17095-3' or value.code = 'LA17096-1' or value.code = 'LA17097-9' or value.code = 'LA17394-0' or value.code = 'LA17099-5' or value.code = 'LA17100-1' or value.code = 'LA17101-9' or value.code = 'LA17703-2' or value.code = 'LA17704-0' or value.code = 'LA17705-7' or value.code = 'LA17706-5' or value.code = 'LA17708-1' or value.code = 'LA17718-0' or value.code = 'LA18205-7' or value.code = 'LA18206-5' or value.code = 'LA18207-3' or value.code = 'LA18208-1')))";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationRhythmValue(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationRhythmValue(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DESTINATION_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationRhythm The receiving '<em><b>Destination Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationRhythmValue(DestinationRhythm destinationRhythm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DESTINATION_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_RHYTHM);
			try {
				VALIDATE_DESTINATION_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			destinationRhythm)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DESTINATION_RHYTHM__DESTINATION_RHYTHM_VALUE,
					EmspcrPlugin.INSTANCE.getString("DestinationRhythmValue"), new Object[] { destinationRhythm }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationRhythmMoodCode(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationRhythmMoodCode(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationRhythmMoodCode(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationRhythmMoodCode(DestinationRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DESTINATION_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationRhythm The receiving '<em><b>Destination Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationRhythmMoodCode(DestinationRhythm destinationRhythm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DESTINATION_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_RHYTHM);
			try {
				VALIDATE_DESTINATION_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DESTINATION_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DESTINATION_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			destinationRhythm)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DESTINATION_RHYTHM__DESTINATION_RHYTHM_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("DestinationRhythmMoodCode"), new Object[] { destinationRhythm }));
			}

			return false;
		}
		return true;
	}

} // DestinationRhythmOperations
