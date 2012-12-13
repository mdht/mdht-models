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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSDispositionSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EMSDispositionSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.4')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionTemplateId(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionTemplateId"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67796-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionCode(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionCode"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionCodeP(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionCodeP"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionText(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionText"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Disposition')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionTitle(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionTitle"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionEntry1(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry1</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry1(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionEntry1(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry1</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry1(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionEntry1(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY1,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEntry1"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionEntry2(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry2</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry2(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionEntry2(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry2</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry2(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionEntry2(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY2,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEntry2"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionEntry3(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry3</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry3(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionEntry3(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry3</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry3(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionEntry3(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY3,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEntry3"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionEntry5(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry5</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry5(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionEntry5(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry5</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry5(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionEntry5(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY5,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEntry5"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionEntry7(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry7</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry7(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionEntry7(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry7</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry7(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionEntry7(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY7,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEntry7"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionEntry6(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry6</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry6(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionEntry6(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry6</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry6(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionEntry6(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY6,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEntry6"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSDispositionSectionEntry4(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry4</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry4(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSDispositionSectionEntry4(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry4</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSDispositionSectionEntry4(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSDispositionSectionEntry4(EMSDispositionSection emsDispositionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY4,
					EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEntry4"),
					new Object[] { emsDispositionSection }));
			}

			return false;
		}
		return true;
	}

} // EMSDispositionSectionOperations
