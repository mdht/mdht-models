/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coded Family Medical History Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getCodedFamilyMedicalHistorySection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.15' constraints.validation.error='CodedFamilyMedicalHistorySectionTemplateId CodedFamilyMedicalHistorySectionFamilyHistoryOrganizer'"
 * @generated
 */
public interface CodedFamilyMedicalHistorySection extends FamilyMedicalHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.15')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.3.15\')'"
	 * @generated
	 */
	boolean validateCodedFamilyMedicalHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(ihe::FamilyHistoryOrganizer))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(ihe::FamilyHistoryOrganizer))'"
	 * @generated
	 */
	boolean validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(ihe::FamilyHistoryOrganizer))->asSequence()->first().oclAsType(ihe::FamilyHistoryOrganizer)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(ihe::FamilyHistoryOrganizer))->asSequence()->first().oclAsType(ihe::FamilyHistoryOrganizer)'"
	 * @generated
	 */
	FamilyHistoryOrganizer getIHEFamilyHistoryOrganizer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodedFamilyMedicalHistorySection init();
} // CodedFamilyMedicalHistorySection