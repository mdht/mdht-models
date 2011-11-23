/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedures Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     This section defines all interventional, surgical, diagnostic, or therapeutic procedures or treatments
 *     pertinent to the patient historically at the time the document is generated. The section may contain all procedures for
 *     the period of time being summarized, but should include notable procedures.
 * </p>
 * The list of surgeries section shall contain a narrative description of the diagnostic and therapeutic operative procedures
 * and associated anesthetic techniques the patient received in the past.
 * The list of surgeries section shall include entries for procedures and references to procedure reports when known as
 * described in the Entry Content Modules.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProceduresSectionEntriesOptional()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.22.2.7' constraints.validation.error='ProceduresSectionEntriesOptionalTemplateId ProceduresSectionEntriesOptionalHasProcedureActivity'"
 * @generated
 */
public interface ProceduresSectionEntriesOptional extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->select(e | e.act.oclIsKindOf(consol::ProcedureActivity))->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.entry->select(e | e.act.oclIsKindOf(consol::ProcedureActivity))->isEmpty()'"
	 * @generated
	 */
	boolean validateProceduresSectionEntriesOptionalHasProcedureActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.7\')'"
	 * @generated
	 */
	boolean validateProceduresSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional init();
} // ProceduresSectionEntriesOptional
