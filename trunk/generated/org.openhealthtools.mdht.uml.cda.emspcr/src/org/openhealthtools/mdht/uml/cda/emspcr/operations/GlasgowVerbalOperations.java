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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Verbal</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlasgowVerbalOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowVerbalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowVerbalTemplateId(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalTemplateId(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_VERBAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.162')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowVerbalTemplateId(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalTemplateId(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_VERBAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowVerbal The receiving '<em><b>Glasgow Verbal</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowVerbalTemplateId(GlasgowVerbal glasgowVerbal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GLASGOW_VERBAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_VERBAL);
			try {
				VALIDATE_GLASGOW_VERBAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_VERBAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_VERBAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			glasgowVerbal)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_VERBAL__GLASGOW_VERBAL_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("GlasgowVerbalTemplateId"), new Object[] { glasgowVerbal }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowVerbalMoodCode(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalMoodCode(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_VERBAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowVerbalMoodCode(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalMoodCode(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_VERBAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowVerbal The receiving '<em><b>Glasgow Verbal</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowVerbalMoodCode(GlasgowVerbal glasgowVerbal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GLASGOW_VERBAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_VERBAL);
			try {
				VALIDATE_GLASGOW_VERBAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_VERBAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_VERBAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			glasgowVerbal)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_VERBAL__GLASGOW_VERBAL_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("GlasgowVerbalMoodCode"), new Object[] { glasgowVerbal }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowVerbalCodeP(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalCodeP(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_VERBAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowVerbalCodeP(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalCodeP(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_VERBAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowVerbal The receiving '<em><b>Glasgow Verbal</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowVerbalCodeP(GlasgowVerbal glasgowVerbal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GLASGOW_VERBAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_VERBAL);
			try {
				VALIDATE_GLASGOW_VERBAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_VERBAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_VERBAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowVerbal)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_VERBAL__GLASGOW_VERBAL_CODE_P,
					EmspcrPlugin.INSTANCE.getString("GlasgowVerbalCodeP"), new Object[] { glasgowVerbal }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbalCodeP", passToken);
				}
				passToken.add(glasgowVerbal);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowVerbalCode(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalCode(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_VERBAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '9270-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowVerbalCode(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalCode(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_VERBAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowVerbal The receiving '<em><b>Glasgow Verbal</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowVerbalCode(GlasgowVerbal glasgowVerbal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbalCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(glasgowVerbal)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_GLASGOW_VERBAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_VERBAL);
			try {
				VALIDATE_GLASGOW_VERBAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_VERBAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_VERBAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowVerbal)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_VERBAL__GLASGOW_VERBAL_CODE,
					EmspcrPlugin.INSTANCE.getString("GlasgowVerbalCode"), new Object[] { glasgowVerbal }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowVerbalValue(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalValue(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_VERBAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowVerbalValue(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowVerbalValue(GlasgowVerbal, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_VERBAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowVerbal The receiving '<em><b>Glasgow Verbal</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowVerbalValue(GlasgowVerbal glasgowVerbal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GLASGOW_VERBAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_VERBAL);
			try {
				VALIDATE_GLASGOW_VERBAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_VERBAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_VERBAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowVerbal)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_VERBAL__GLASGOW_VERBAL_VALUE,
					EmspcrPlugin.INSTANCE.getString("GlasgowVerbalValue"), new Object[] { glasgowVerbal }));
			}

			return false;
		}
		return true;
	}

} // GlasgowVerbalOperations
