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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Protocol Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSProtocolSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EMSProtocolSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSProtocolSectionTemplateId(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionTemplateId(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.7')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSProtocolSectionTemplateId(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionTemplateId(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSProtocolSectionTemplateId(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionTemplateId"),
					new Object[] { emsProtocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSProtocolSectionCode(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionCode(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67537-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSProtocolSectionCode(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionCode(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSProtocolSectionCode(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionCode"), new Object[] { emsProtocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSProtocolSectionTitle(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionTitle(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Protocol Section')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSProtocolSectionTitle(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionTitle(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSProtocolSectionTitle(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionTitle"), new Object[] { emsProtocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSProtocolSectionText(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionText(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateEMSProtocolSectionText(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionText(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSProtocolSectionText(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionText"), new Object[] { emsProtocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSProtocolSectionEntry1(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry1</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionEntry1(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSProtocolSectionEntry1(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry1</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionEntry1(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_PROTOCOL_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSProtocolSectionEntry1(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_PROTOCOL_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROTOCOL_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_ENTRY1,
					EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEntry1"), new Object[] { emsProtocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSProtocolSectionEntry3(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry3</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionEntry3(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSProtocolSectionEntry3(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry3</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSProtocolSectionEntry3(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_PROTOCOL_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSProtocolSectionEntry3(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_PROTOCOL_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROTOCOL_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_ENTRY3,
					EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEntry3"), new Object[] { emsProtocolSection }));
			}

			return false;
		}
		return true;
	}

} // EMSProtocolSectionOperations
