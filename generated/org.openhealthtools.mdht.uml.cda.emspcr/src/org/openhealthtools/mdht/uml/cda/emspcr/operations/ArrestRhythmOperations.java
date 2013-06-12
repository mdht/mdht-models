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

import org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Arrest Rhythm</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm#validateArrestRhythmTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm#validateArrestRhythmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm#validateArrestRhythmValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm#validateArrestRhythmMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrestRhythmOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ArrestRhythmOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateArrestRhythmTemplateId(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateArrestRhythmTemplateId(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ARREST_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.127')";

	/**
	* The cached OCL invariant for the '{@link #validateArrestRhythmTemplateId(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateArrestRhythmTemplateId(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ARREST_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param arrestRhythm The receiving '<em><b>Arrest Rhythm</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateArrestRhythmTemplateId(ArrestRhythm arrestRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ARREST_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ARREST_RHYTHM);
			try {
				VALIDATE_ARREST_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ARREST_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ARREST_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			arrestRhythm)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ARREST_RHYTHM__ARREST_RHYTHM_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ArrestRhythmTemplateId"), new Object[] { arrestRhythm }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateArrestRhythmCode(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateArrestRhythmCode(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ARREST_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67512-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateArrestRhythmCode(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateArrestRhythmCode(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ARREST_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param arrestRhythm The receiving '<em><b>Arrest Rhythm</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateArrestRhythmCode(ArrestRhythm arrestRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ARREST_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ARREST_RHYTHM);
			try {
				VALIDATE_ARREST_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ARREST_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ARREST_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(arrestRhythm)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ARREST_RHYTHM__ARREST_RHYTHM_CODE,
					EmspcrPlugin.INSTANCE.getString("ArrestRhythmCode"), new Object[] { arrestRhythm }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateArrestRhythmValue(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateArrestRhythmValue(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ARREST_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17068-0' or value.code = 'LA17070-6' or value.code = 'LA17071-4' or value.code = 'LA17072-2' or value.code = 'LA17073-0' or value.code = 'LA17074-8' or value.code = 'LA17394-0')))";

	/**
	* The cached OCL invariant for the '{@link #validateArrestRhythmValue(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateArrestRhythmValue(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ARREST_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param arrestRhythm The receiving '<em><b>Arrest Rhythm</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateArrestRhythmValue(ArrestRhythm arrestRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ARREST_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ARREST_RHYTHM);
			try {
				VALIDATE_ARREST_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ARREST_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ARREST_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(arrestRhythm)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ARREST_RHYTHM__ARREST_RHYTHM_VALUE,
					EmspcrPlugin.INSTANCE.getString("ArrestRhythmValue"), new Object[] { arrestRhythm }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateArrestRhythmMoodCode(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateArrestRhythmMoodCode(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ARREST_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateArrestRhythmMoodCode(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateArrestRhythmMoodCode(ArrestRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ARREST_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param arrestRhythm The receiving '<em><b>Arrest Rhythm</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateArrestRhythmMoodCode(ArrestRhythm arrestRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ARREST_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ARREST_RHYTHM);
			try {
				VALIDATE_ARREST_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ARREST_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ARREST_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(arrestRhythm)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ARREST_RHYTHM__ARREST_RHYTHM_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ArrestRhythmMoodCode"), new Object[] { arrestRhythm }));
			}

			return false;
		}
		return true;
	}

} // ArrestRhythmOperations
