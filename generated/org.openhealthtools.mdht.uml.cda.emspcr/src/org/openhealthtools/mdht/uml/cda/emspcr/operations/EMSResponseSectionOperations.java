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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionDelayOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Delay Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionDispatchLocationOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Dispatch Location Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionResponseOdometerReadingOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Response Odometer Reading Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionResponseModeToScene(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Response Mode To Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#getDelayOrganizer() <em>Get Delay Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#getDispatchLocationOrganizer() <em>Get Dispatch Location Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#getResponseOdometerReadingOrganizer() <em>Get Response Odometer Reading Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#getResponseModeToScene() <em>Get Response Mode To Scene</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionDelayOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Delay Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionDelayOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::DelayOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionDelayOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Delay Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionDelayOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEMSResponseSectionDelayOrganizer(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_DELAY_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionDelayOrganizer"),
					new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionDispatchLocationOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Dispatch Location Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionDispatchLocationOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::DispatchLocationOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionDispatchLocationOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Dispatch Location Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionDispatchLocationOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEMSResponseSectionDispatchLocationOrganizer(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionDispatchLocationOrganizer"),
					new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionResponseOdometerReadingOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Response Odometer Reading Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionResponseOdometerReadingOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::ResponseOdometerReadingOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionResponseOdometerReadingOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Response Odometer Reading Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionResponseOdometerReadingOrganizer(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEMSResponseSectionResponseOdometerReadingOrganizer(
			EMSResponseSection emsResponseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionResponseOdometerReadingOrganizer"),
					new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSResponseSectionResponseModeToScene(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Response Mode To Scene</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionResponseModeToScene(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ResponseModeToScene) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSResponseSectionResponseModeToScene(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Response Mode To Scene</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSResponseSectionResponseModeToScene(EMSResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateEMSResponseSectionResponseModeToScene(EMSResponseSection emsResponseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_RESPONSE_SECTION);
			try {
				VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsResponseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_RESPONSE_SECTION__EMS_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE,
					EmspcrPlugin.INSTANCE.getString("EMSResponseSectionResponseModeToScene"),
					new Object[] { emsResponseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDelayOrganizer(EMSResponseSection) <em>Get Delay Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayOrganizer(EMSResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DELAY_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::DelayOrganizer))->asSequence()->any(true).oclAsType(emspcr::DelayOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getDelayOrganizer(EMSResponseSection) <em>Get Delay Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayOrganizer(EMSResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DELAY_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DelayOrganizer getDelayOrganizer(EMSResponseSection emsResponseSection) {
		if (GET_DELAY_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_RESPONSE_SECTION,
				EmspcrPackage.Literals.EMS_RESPONSE_SECTION.getEAllOperations().get(64));
			try {
				GET_DELAY_ORGANIZER__EOCL_QRY = helper.createQuery(GET_DELAY_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DELAY_ORGANIZER__EOCL_QRY);
		return (DelayOrganizer) query.evaluate(emsResponseSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDispatchLocationOrganizer(EMSResponseSection) <em>Get Dispatch Location Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchLocationOrganizer(EMSResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISPATCH_LOCATION_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::DispatchLocationOrganizer))->asSequence()->any(true).oclAsType(emspcr::DispatchLocationOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getDispatchLocationOrganizer(EMSResponseSection) <em>Get Dispatch Location Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchLocationOrganizer(EMSResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISPATCH_LOCATION_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DispatchLocationOrganizer getDispatchLocationOrganizer(EMSResponseSection emsResponseSection) {
		if (GET_DISPATCH_LOCATION_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_RESPONSE_SECTION,
				EmspcrPackage.Literals.EMS_RESPONSE_SECTION.getEAllOperations().get(65));
			try {
				GET_DISPATCH_LOCATION_ORGANIZER__EOCL_QRY = helper.createQuery(GET_DISPATCH_LOCATION_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISPATCH_LOCATION_ORGANIZER__EOCL_QRY);
		return (DispatchLocationOrganizer) query.evaluate(emsResponseSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResponseOdometerReadingOrganizer(EMSResponseSection) <em>Get Response Odometer Reading Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseOdometerReadingOrganizer(EMSResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::ResponseOdometerReadingOrganizer))->asSequence()->any(true).oclAsType(emspcr::ResponseOdometerReadingOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getResponseOdometerReadingOrganizer(EMSResponseSection) <em>Get Response Odometer Reading Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseOdometerReadingOrganizer(EMSResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResponseOdometerReadingOrganizer getResponseOdometerReadingOrganizer(
			EMSResponseSection emsResponseSection) {
		if (GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_RESPONSE_SECTION,
				EmspcrPackage.Literals.EMS_RESPONSE_SECTION.getEAllOperations().get(66));
			try {
				GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_QRY = helper.createQuery(GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_QRY);
		return (ResponseOdometerReadingOrganizer) query.evaluate(emsResponseSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResponseModeToScene(EMSResponseSection) <em>Get Response Mode To Scene</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModeToScene(EMSResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESPONSE_MODE_TO_SCENE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ResponseModeToScene))->asSequence()->any(true).oclAsType(emspcr::ResponseModeToScene)";

	/**
	 * The cached OCL query for the '{@link #getResponseModeToScene(EMSResponseSection) <em>Get Response Mode To Scene</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModeToScene(EMSResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESPONSE_MODE_TO_SCENE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResponseModeToScene getResponseModeToScene(EMSResponseSection emsResponseSection) {
		if (GET_RESPONSE_MODE_TO_SCENE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_RESPONSE_SECTION,
				EmspcrPackage.Literals.EMS_RESPONSE_SECTION.getEAllOperations().get(67));
			try {
				GET_RESPONSE_MODE_TO_SCENE__EOCL_QRY = helper.createQuery(GET_RESPONSE_MODE_TO_SCENE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESPONSE_MODE_TO_SCENE__EOCL_QRY);
		return (ResponseModeToScene) query.evaluate(emsResponseSection);
	}

} // EMSResponseSectionOperations
