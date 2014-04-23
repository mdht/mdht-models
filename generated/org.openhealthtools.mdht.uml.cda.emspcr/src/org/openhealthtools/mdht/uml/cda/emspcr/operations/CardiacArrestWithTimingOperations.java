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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest With Timing</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming#validateCardiacArrestWithTimingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming#validateCardiacArrestWithTimingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming#validateCardiacArrestWithTimingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming#validateCardiacArrestWithTimingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardiacArrestWithTimingOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacArrestWithTimingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestWithTimingTemplateId(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestWithTimingTemplateId(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_WITH_TIMING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.123')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestWithTimingTemplateId(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestWithTimingTemplateId(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_WITH_TIMING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestWithTiming The receiving '<em><b>Cardiac Arrest With Timing</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestWithTimingTemplateId(CardiacArrestWithTiming cardiacArrestWithTiming,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_WITH_TIMING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_WITH_TIMING);
			try {
				VALIDATE_CARDIAC_ARREST_WITH_TIMING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_WITH_TIMING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_WITH_TIMING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrestWithTiming)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST_WITH_TIMING__CARDIAC_ARREST_WITH_TIMING_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestWithTimingTemplateId"),
					new Object[] { cardiacArrestWithTiming }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestWithTimingMoodCode(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestWithTimingMoodCode(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_WITH_TIMING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestWithTimingMoodCode(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestWithTimingMoodCode(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_WITH_TIMING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestWithTiming The receiving '<em><b>Cardiac Arrest With Timing</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestWithTimingMoodCode(CardiacArrestWithTiming cardiacArrestWithTiming,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_WITH_TIMING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_WITH_TIMING);
			try {
				VALIDATE_CARDIAC_ARREST_WITH_TIMING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_WITH_TIMING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_WITH_TIMING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrestWithTiming)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST_WITH_TIMING__CARDIAC_ARREST_WITH_TIMING_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestWithTimingMoodCode"),
					new Object[] { cardiacArrestWithTiming }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestWithTimingCode(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestWithTimingCode(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_WITH_TIMING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67502-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestWithTimingCode(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestWithTimingCode(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_WITH_TIMING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestWithTiming The receiving '<em><b>Cardiac Arrest With Timing</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestWithTimingCode(CardiacArrestWithTiming cardiacArrestWithTiming,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_WITH_TIMING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_WITH_TIMING);
			try {
				VALIDATE_CARDIAC_ARREST_WITH_TIMING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_WITH_TIMING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_WITH_TIMING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrestWithTiming)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST_WITH_TIMING__CARDIAC_ARREST_WITH_TIMING_CODE,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestWithTimingCode"),
					new Object[] { cardiacArrestWithTiming }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestWithTimingValue(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestWithTimingValue(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_WITH_TIMING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17054-0' or value.code = 'LA17055-7')))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestWithTimingValue(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest With Timing Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestWithTimingValue(CardiacArrestWithTiming, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARDIAC_ARREST_WITH_TIMING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestWithTiming The receiving '<em><b>Cardiac Arrest With Timing</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestWithTimingValue(CardiacArrestWithTiming cardiacArrestWithTiming,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARDIAC_ARREST_WITH_TIMING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_WITH_TIMING);
			try {
				VALIDATE_CARDIAC_ARREST_WITH_TIMING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARDIAC_ARREST_WITH_TIMING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARDIAC_ARREST_WITH_TIMING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cardiacArrestWithTiming)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARDIAC_ARREST_WITH_TIMING__CARDIAC_ARREST_WITH_TIMING_VALUE,
					EmspcrPlugin.INSTANCE.getString("CardiacArrestWithTimingValue"),
					new Object[] { cardiacArrestWithTiming }));
			}

			return false;
		}
		return true;
	}

} // CardiacArrestWithTimingOperations
