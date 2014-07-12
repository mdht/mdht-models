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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Procedures Performed Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#validateEMSProceduresPerformedSectionProcedureActivityProcedure1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Procedure Activity Procedure1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection#getProcedureActivityProcedure1s() <em>Get Procedure Activity Procedure1s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSProceduresPerformedSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSProceduresPerformedSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProceduresPerformedSectionTemplateId(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionTemplateId(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.21')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProceduresPerformedSectionTemplateId(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionTemplateId(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProceduresPerformedSection The receiving '<em><b>EMS Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProceduresPerformedSectionTemplateId(
			EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSProceduresPerformedSectionTemplateId"),
					new Object[] { emsProceduresPerformedSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProceduresPerformedSectionCode(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionCode(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '29554-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProceduresPerformedSectionCode(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionCode(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProceduresPerformedSection The receiving '<em><b>EMS Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProceduresPerformedSectionCode(
			EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSProceduresPerformedSectionCode"),
					new Object[] { emsProceduresPerformedSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProceduresPerformedSectionCodeP(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionCodeP(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProceduresPerformedSectionCodeP(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionCodeP(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProceduresPerformedSection The receiving '<em><b>EMS Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProceduresPerformedSectionCodeP(
			EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSProceduresPerformedSectionCodeP"),
					new Object[] { emsProceduresPerformedSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProceduresPerformedSectionTitle(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionTitle(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Procedures Performed')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProceduresPerformedSectionTitle(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionTitle(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProceduresPerformedSection The receiving '<em><b>EMS Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProceduresPerformedSectionTitle(
			EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSProceduresPerformedSectionTitle"),
					new Object[] { emsProceduresPerformedSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProceduresPerformedSectionText(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionText(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProceduresPerformedSectionText(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionText(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProceduresPerformedSection The receiving '<em><b>EMS Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProceduresPerformedSectionText(
			EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSProceduresPerformedSectionText"),
					new Object[] { emsProceduresPerformedSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProceduresPerformedSectionProcedureActivityProcedure1(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Procedure Activity Procedure1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionProcedureActivityProcedure1(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(emspcr::Procedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProceduresPerformedSectionProcedureActivityProcedure1(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Procedures Performed Section Procedure Activity Procedure1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProceduresPerformedSectionProcedureActivityProcedure1(EMSProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProceduresPerformedSection The receiving '<em><b>EMS Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProceduresPerformedSectionProcedureActivityProcedure1(
			EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsProceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1,
					EmspcrPlugin.INSTANCE.getString("EMSProceduresPerformedSectionProcedureActivityProcedure1"),
					new Object[] { emsProceduresPerformedSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityProcedure1s(EMSProceduresPerformedSection) <em>Get Procedure Activity Procedure1s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure1s(EMSProceduresPerformedSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(emspcr::Procedure)).oclAsType(emspcr::Procedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityProcedure1s(EMSProceduresPerformedSection) <em>Get Procedure Activity Procedure1s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure1s(EMSProceduresPerformedSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Procedure> getProcedureActivityProcedure1s(
			EMSProceduresPerformedSection emsProceduresPerformedSection) {
		if (GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION,
				EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION.getEAllOperations().get(61));
			try {
				GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(emsProceduresPerformedSection);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

} // EMSProceduresPerformedSectionOperations
