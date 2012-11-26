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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Response Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSResponseSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSResponseSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionTemplateId(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionTemplateId(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionTemplateId(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionTemplateId(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionTemplateId(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionTemplateId"),
					new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionCode(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionCode(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67664-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionCode(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionCode(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionCode(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionCode"), new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionCodeP(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionCodeP(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionCodeP(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionCodeP(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionCodeP(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionCodeP"), new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionText(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionText"), new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionTitle(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionTitle(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Response')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionTitle(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionTitle(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionText(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionText(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionText(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionText(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionTitle(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionTitle"), new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionEntry1(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionEntry1(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionEntry1(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionEntry1(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionEntry1(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_ENTRY1,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionEntry1"), new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionEntry2(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionEntry2(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionEntry2(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionEntry2(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionEntry2(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_ENTRY2,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionEntry2"), new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionEntry3(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionEntry3(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionEntry3(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry3</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionEntry3(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionEntry3(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_ENTRY3,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionEntry3"), new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionEntry4(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionEntry4(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionEntry4(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry4</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionEntry4(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsResponseSection The receiving '<em><b>EMS Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSResponseSectionEntry4(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_ENTRY4,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionEntry4"), new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

} // EMSResponseSectionOperations
