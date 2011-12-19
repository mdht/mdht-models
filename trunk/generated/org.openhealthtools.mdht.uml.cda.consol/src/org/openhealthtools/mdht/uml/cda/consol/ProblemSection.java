/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection#getProblemConcern <em>Problem Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProblemSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.22.2.5.1' constraints.validation.error='ProblemSectionTemplateId'"
 * @generated
 */
public interface ProblemSection extends ProblemSectionEntriesOptional {
	/**
	 * Returns the value of the '<em><b>Problem Concern</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Concern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Concern</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProblemSection_ProblemConcern()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ProblemConcernAct> getProblemConcern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection init();
} // ProblemSection
