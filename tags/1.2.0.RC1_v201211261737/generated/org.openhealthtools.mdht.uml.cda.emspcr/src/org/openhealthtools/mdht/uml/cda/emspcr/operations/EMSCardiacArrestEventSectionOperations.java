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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Cardiac Arrest Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Entry1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSCardiacArrestEventSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSCardiacArrestEventSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCardiacArrestEventSectionTemplateId(
			EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionTemplateId"),
					new Object[] { emsCardiacArrestEventSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67799-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCardiacArrestEventSectionCode(
			EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionCode"),
					new Object[] { emsCardiacArrestEventSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Cardiac Arrest Event')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCardiacArrestEventSectionTitle(
			EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionTitle"),
					new Object[] { emsCardiacArrestEventSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCardiacArrestEventSectionText(
			EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionText"),
					new Object[] { emsCardiacArrestEventSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionEntry1(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Entry1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionEntry1(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionEntry1(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Entry1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionEntry1(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSCardiacArrestEventSectionEntry1(
			EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1,
					EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionEntry1"),
					new Object[] { emsCardiacArrestEventSection }));
			}

			return false;
		}
		return true;
	}

} // EMSCardiacArrestEventSectionOperations
