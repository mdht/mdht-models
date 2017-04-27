/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures And Interventions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection#validateProceduresAndInterventionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures And Interventions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection#validateProceduresAndInterventionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures And Interventions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection#getProcedureEntry() <em>Get Procedure Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresAndInterventionsSectionOperations extends SectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresAndInterventionsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresAndInterventionsSectionTemplateId(ProceduresAndInterventionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures And Interventions Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresAndInterventionsSectionTemplateId(ProceduresAndInterventionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.13.2.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresAndInterventionsSectionTemplateId(ProceduresAndInterventionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures And Interventions Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresAndInterventionsSectionTemplateId(ProceduresAndInterventionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresAndInterventionsSection The receiving '<em><b>Procedures And Interventions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresAndInterventionsSectionTemplateId(
			ProceduresAndInterventionsSection proceduresAndInterventionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURES_AND_INTERVENTIONS_SECTION);
			try {
				VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresAndInterventionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PROCEDURES_AND_INTERVENTIONS_SECTION__PROCEDURES_AND_INTERVENTIONS_SECTION_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString(
							"ProceduresAndInterventionsSectionProceduresAndInterventionsSectionTemplateId"),
						new Object[] { proceduresAndInterventionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresAndInterventionsSectionCode(ProceduresAndInterventionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures And Interventions Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresAndInterventionsSectionCode(ProceduresAndInterventionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '29544-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresAndInterventionsSectionCode(ProceduresAndInterventionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures And Interventions Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresAndInterventionsSectionCode(ProceduresAndInterventionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresAndInterventionsSection The receiving '<em><b>Procedures And Interventions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresAndInterventionsSectionCode(
			ProceduresAndInterventionsSection proceduresAndInterventionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURES_AND_INTERVENTIONS_SECTION);
			try {
				VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresAndInterventionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PROCEDURES_AND_INTERVENTIONS_SECTION__PROCEDURES_AND_INTERVENTIONS_SECTION_CODE,
						IHEPlugin.INSTANCE.getString(
							"ProceduresAndInterventionsSectionProceduresAndInterventionsSectionCode"),
						new Object[] { proceduresAndInterventionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEntry(ProceduresAndInterventionsSection) <em>Get Procedure Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntry(ProceduresAndInterventionsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ENTRY__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ihe::ProcedureEntry))->asSequence()->any(true).oclAsType(ihe::ProcedureEntry)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEntry(ProceduresAndInterventionsSection) <em>Get Procedure Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntry(ProceduresAndInterventionsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProcedureEntry getProcedureEntry(
			ProceduresAndInterventionsSection proceduresAndInterventionsSection) {

		if (GET_PROCEDURE_ENTRY__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PROCEDURES_AND_INTERVENTIONS_SECTION,
				IHEPackage.Literals.PROCEDURES_AND_INTERVENTIONS_SECTION.getEAllOperations().get(57));
			try {
				GET_PROCEDURE_ENTRY__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURE_ENTRY__EOCL_QRY);
		return (ProcedureEntry) query.evaluate(proceduresAndInterventionsSection);
	}

} // ProceduresAndInterventionsSectionOperations
